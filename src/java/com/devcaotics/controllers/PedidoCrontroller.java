/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Pedido;
import com.devcaotics.model.Usuario;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONObject;

/**
 *
 * @author angelomig
 */
@ManagedBean(name = "pedidoController")
@SessionScoped
public class PedidoCrontroller implements Serializable {
    
    public List<Pedido> readFromUser() {
        Usuario logado = ((LoginController)((HttpSession)(FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        
        List<Pedido> pedidos =  ManagerDao.getCurrentInstance()
                .read("SELECT p FROM Pedido p WHERE p.user.id ="+ logado.getId(), 
                        Pedido.class);
        for(Pedido p: pedidos)
        {
            if(!p.isPago())
            {
                String pago="";
                try {
                    pago = visualizarBoleto(p.getBoleto()[1], "status");
                } catch (Exception ex) {
                    Logger.getLogger(PedidoCrontroller.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(pago.equals("paid"))
                {
                    p.setPago(true);
                    ManagerDao.getCurrentInstance().update(p);
                    logado.getLivros().add(p.getLivro());
                    ManagerDao.getCurrentInstance().update(logado);
                }
            }
        }
        
        return pedidos;
    }
    public void verificaBoleto(Pedido p)
    {
        if(!p.isPago())
            {
                String pago="";
                try {
                    pago = visualizarBoleto(p.getBoleto()[1], "status");
                } catch (Exception ex) {
                    Logger.getLogger(PedidoCrontroller.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(pago.equals("paid"))
                {
                    p.setPago(true);
                    ManagerDao.getCurrentInstance().update(p);
                    
                }
            }
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
        System.out.println("URL: "+"https://api-sandbox.kobana.com.br/v1/bank_billets/?id=" + idVisualizacaoBoleto);
        System.out.println("Response Code: "+connection.getResponseCode());
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
}
