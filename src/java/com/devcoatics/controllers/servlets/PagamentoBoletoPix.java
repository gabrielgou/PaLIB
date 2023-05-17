/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.devcoatics.controllers.servlets;

import com.devcaotics.model.Boleto;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;



/**
 *
 * @author rapha
 */

@WebServlet (name = "PagamentoBoletoPix", urlPatterns = {"/PagamentoBoletoPix"})

public class PagamentoBoletoPix extends HttpServlet {

    
   /* 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PagamentoBoletoPix</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PagamentoBoletoPix at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

*/
   
    
    /*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        response.setContentType("text/html; charset=UTF-8");

            PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Teste</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Entrou aqui</h2>");
            out.println("</body>");
            out.println("</html>");
        
    }
*/
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getOutputStream();
        
        // URL da API que você deseja consumir
        String apiUrl = "https://api-sandbox.kobana.com.br/v1/bank_billets";

        // Token de autenticação
        String token = "vlsREO7Xif4Onw3ZKKrkv9E7_cJlNMLxrIUH-GIYSzs";

        // Cria a URL da API
        URL url = new URL(apiUrl);

        // Abre uma conexão HTTP com a URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");

        // Define o cabeçalho Authorization com o token Bearer
        connection.setRequestProperty("Authorization", "Bearer " + token);
        connection.setRequestProperty("Content-Type", "application/json");

        // Habilita a escrita de dados no corpo da solicitação
        connection.setDoOutput(true);

        // Define os parâmetros da solicitação POST, se necessário
        Boleto boleto = new Boleto(
                        14.85,
                        "2023-05-18", 
                        "JOSÉ ALFREDO", 
                        "850.927.528-90",
                        "SE", 
                        "Aracaju",
                        "49030360", 
                        "Rua Francolino Rodrigues Lima",
                        "Farolândia"
                
        );
        //transfoma em json o objeto
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(boleto);
        
        
        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
        outputStream.writeBytes(jsonBody);
        System.out.println(jsonBody);
        outputStream.flush();
        outputStream.close();

       
        
        // Verifica se a resposta da API é bem-sucedida
        int responseCode = connection.getResponseCode();
        
        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Lê a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder responseContent = new StringBuilder();
            

            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();

            // Imprime a resposta no console
            System.out.println(responseContent.toString());
            

            // Você pode fazer o que quiser com a resposta da API aqui,
            // como enviar para o cliente ou manipular os dados.

        } else {
            // A resposta da API não foi bem-sucedida
            System.out.println("Falha ao consumir a API. Código de resposta: " + responseCode);
        }

        // Fecha a conexão HTTP
        connection.disconnect();
    
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
