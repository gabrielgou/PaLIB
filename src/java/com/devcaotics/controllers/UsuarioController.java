/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Usuario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.ws.http.HTTPException;
import org.json.JSONObject;

/**
 *
 * @author gabri
 */
@ManagedBean(name = "usuarioController")
@SessionScoped
public class UsuarioController implements Serializable {
    private Usuario user;
    private Usuario selUser;
    private String cep;
     @PostConstruct
    public void init()
    {
        this.user = new Usuario();
    }
    public void inserir(String senha)
    {
        if(!this.user.getSenha().equals(senha))
        {
             FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro Ao fazer Cadastro","Senha Não Confere"));
             return;
        }
        ManagerDao.getCurrentInstance().insert(this.user);
         this.user = new Usuario();
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","Usuario cadastrado com sucesso!"));
              
    }
     public List<Usuario> readAll(){
        
        List<Usuario> users = ManagerDao.getCurrentInstance()
                .read("select u from Usuario u", 
                        Usuario.class);
        return users;
    }
    public void clearSelection(){
        
        this.selUser = null;
        
    }
    public void alterar(){
        
        ManagerDao.getCurrentInstance().update(this.selUser);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Usuario alterado com sucesso!"));
                
    }
    public void deletar(){
        ManagerDao.getCurrentInstance().delete(this.selUser);
    
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Usuario deletado com sucesso!"));
    }
    public void getPreencherCEP()
    {
        String api = "https://viacep.com.br/ws/"+this.cep+"/json/";
        try{
            URL url = new URL(api);
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            if(connection.getResponseCode()!=200) throw new Exception("Não Conectou ao URL");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
            String line;
            StringBuilder responseContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();
            connection.disconnect();
            JSONObject obj = new JSONObject(responseContent.toString());
            System.out.print(responseContent.toString());
            this.user.getEndereco().setBairro(obj.getString("bairro").toString());
            this.user.getEndereco().setCidade(obj.getString("localidade").toString());
            this.user.getEndereco().setNome(obj.getString("logradouro").toString());
            this.user.getEndereco().setUf(obj.getString("uf").toString());
        }
        catch(MalformedURLException ex){
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Usuario getSelUser() {
        return selUser;
    }

    public void setSelUser(Usuario selUser) {
        this.selUser = selUser;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
