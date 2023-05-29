/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devcaotics.controllers;

import com.devcaotics.model.Boleto;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author rapha
 */
@ManagedBean (name = "pagamentoController")
@SessionScoped
public class PagamentoController implements Serializable{
    
   
    
public void realizarPagamento() throws Exception {
    URL url = new URL("https://api-sandbox.kobana.com.br/v1/bank_billets");
    HttpURLConnection requisicao = (HttpURLConnection) url.openConnection();
    requisicao.setRequestMethod("POST");

    // Token de autenticação
    String token = "vlsREO7Xif4Onw3ZKKrkv9E7_cJlNMLxrIUH-GIYSzs";

    requisicao.setRequestProperty("Authorization", "Bearer " + token);
    requisicao.setRequestProperty("Content-type", "application/json");
    requisicao.setDoOutput(true);

    OutputStream outputStream = requisicao.getOutputStream();

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

    String jsonDeResposta = response.toString();
}

}
