/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Boleto;
import com.devcaotics.model.BoletoResponse;
import com.devcaotics.model.Livro;
import com.devcaotics.model.Pagamento;
import com.devcaotics.model.Pedido;
import com.devcaotics.model.Usuario;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 *
 * @author rapha
 */

@ManagedBean(name = "pagamentoController")

@SessionScoped
public class PagamentoController implements Serializable {

    String urlBoleto = null;
    Pedido pedido = null;

    public String fazerPedido(Livro livro, Usuario user) throws Exception {
        URL url = new URL("https://api-sandbox.kobana.com.br/v1/bank_billets");
        HttpURLConnection requisicao = (HttpURLConnection) url.openConnection();
        requisicao.setRequestMethod("POST");

        // Token de autenticação
        String token = "vlsREO7Xif4Onw3ZKKrkv9E7_cJlNMLxrIUH-GIYSzs";

        requisicao.setRequestProperty("Authorization", "Bearer " + token);
        requisicao.setRequestProperty("Content-type", "application/json");
        requisicao.setDoOutput(true);

        OutputStream outputStream = requisicao.getOutputStream();

        Boleto boleto = new Boleto();

        boleto.setAmount(livro.getPreco());
        boleto.setExpire_at("2026-12-31");
        boleto.setCustomer_person_name(user.getNome());
        boleto.setCustomer_cnpj_cpf(user.getCpf());
        boleto.setCustomer_state(user.getEndereco().getUf());
        boleto.setCustomer_city_name(user.getEndereco().getCidade());
        boleto.setCustomer_zipcode("51020260");
        boleto.setCustomer_address(user.getEndereco().getBairro() + " - " + user.getEndereco().getCidade() + " - " + user.getEndereco().getUf());
        boleto.setCustomer_neighborhood(user.getEndereco().getBairro());

        // Converte o objeto em JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(boleto);

        // Envia o corpo da requisição
        outputStream.write(jsonBody.getBytes("UTF-8"));
        outputStream.close();

        requisicao.connect();

        // Lê a resposta
        int responseCode = requisicao.getResponseCode();
        BufferedReader reader;
        if (responseCode >= HttpURLConnection.HTTP_BAD_REQUEST) {
            reader = new BufferedReader(new InputStreamReader(requisicao.getErrorStream()));
        } else {
            reader = new BufferedReader(new InputStreamReader(requisicao.getInputStream()));
        }

        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        BoletoResponse boletoResponse = objectMapper.readValue(response.toString(), BoletoResponse.class);

//    String jsonDeResposta = response.toString();
        System.out.println(boletoResponse.getFormats().getPng());

        urlBoleto = boletoResponse.getFormats().getBoleto_hibrido();

        String[] boletoArray = {urlBoleto, Long.toString(boletoResponse.getId())};

        this.pedido = new Pedido(user, livro, boletoArray);

        ManagerDao.getCurrentInstance().insert(this.pedido);

        this.pedido = null;

        return "indexMeusPedidos";
    }

    public String visualizarBoleto(String idVisualizacaoBoleto, String atributo) throws Exception {
        URL url = new URL("https://api-sandbox.kobana.com.br/v1/bank_billets/?id=" + idVisualizacaoBoleto);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        String token = "vlsREO7Xif4Onw3ZKKrkv9E7_cJlNMLxrIUH-GIYSzs";

        connection.setRequestProperty("Authorization", "Bearer " + token);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.connect();
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        BufferedReader reader;
        int responseCode = connection.getResponseCode();
        if (responseCode >= HttpURLConnection.HTTP_BAD_REQUEST) {
            reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
        } else {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        }
        
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        TypeReference<List<Map<String, Object>>> typeReference = new TypeReference<List<Map<String, Object>>>(){};
        List<Map<String, Object>> responseList = objectMapper.readValue(response.toString(), typeReference);
        
        Object idBoleto = null;
        if (!responseList.isEmpty()) {
            Map<String, Object> primeiroObjeto = responseList.get(0);
            idBoleto = primeiroObjeto.get(atributo);
        }
                
        return idBoleto.toString();
    }
    
    public String verificarPagamento(Pedido pedido) throws Exception {
        System.out.println("Entrou aq");
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dateFormat.format(new Date());

        //Cria o body e transforma em JSON
        Pagamento pagamento = new Pagamento();
        pagamento.setPaid_amount(pedido.getLivro().getPreco());
        pagamento.setPaid_at(data);        
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(pagamento);
                       
        
        URL url = new URL("https://api-sandbox.kobana.com.br/v1/bank_billets/" + pedido.getBoleto()[1] + "/pay");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("PUT");

        String token = "vlsREO7Xif4Onw3ZKKrkv9E7_cJlNMLxrIUH-GIYSzs";

        connection.setRequestProperty("Authorization", "Bearer " + token);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
        
        
        System.out.println("Json Body aq: " + jsonBody + " => ID: " + pedido.getBoleto()[1]);
        
        // Envia o corpo da requisição
        outputStream.write(jsonBody.getBytes("UTF-8"));
        outputStream.close();
        
        outputStream.close();

        connection.connect();

        int responseCode = connection.getResponseCode();
        
        System.out.println(responseCode);
        if (responseCode >= HttpURLConnection.HTTP_BAD_REQUEST) {
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Erro ao Pagar",
                    "Erro no pagamento"));
            
            return "indexMeusPedidos";
        } else {
            
            // TEM QUE COLOCAR O LIVRO DENTRO DA LISTA DE LIVROS DO USUÁRIO DE DAR UPDATE!!!!!!!
            pedido.setPago(true);
            ManagerDao.getCurrentInstance().update(pedido);
            
            Usuario logado = ((LoginController) ((HttpSession) (FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
            
            logado.getLivros().add(pedido.getLivro());
            ManagerDao.getCurrentInstance().update(logado);
            
            FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO, "Pagamento realizado com sucesso",
                    "Seu pagamento foi efeituado"));
            
            return "indexMeusLivros";
        }
    }

    public String getUrlBoleto() {
        return urlBoleto;
    }

    public void setUrlBoleto(String urlBoleto) {
        this.urlBoleto = urlBoleto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
