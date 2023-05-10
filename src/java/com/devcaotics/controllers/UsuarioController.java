/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author gabri
 */
@ManagedBean(name = "usuarioController")
@SessionScoped
public class UsuarioController implements Serializable {
    private Usuario user;
    private Usuario selUser;
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
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro Ao fazer Login","Senha Não Confere"));
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
    
}
