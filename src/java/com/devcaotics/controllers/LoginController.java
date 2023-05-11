/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Administrador;
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
 * @author ALUNO
 */
@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController implements Serializable {
    
    private String tipoLogado;
    
    private Usuario usuarioLogado;
    private Administrador administradorLogado;
    
    @PostConstruct
    public void init(){
        this.tipoLogado = "";
        this.usuarioLogado=null;
        this.administradorLogado=null;
    }
    
    public String logar(String login, String senha){
        
        List<Usuario> user = ManagerDao.getCurrentInstance().
                read("select u from Usuario u where "
                        + "u.cpf='"+login+"' and u.senha='"+senha+"'"
                        , Usuario.class);
        
        
        if(!user.isEmpty()){
            
            this.usuarioLogado = user.get(0);
            this.tipoLogado = "usuario";
            
            return "indexCompra";
        }
        
        List<Administrador> administrador = ManagerDao.getCurrentInstance().
                read("select a from Administrador a where "
                     +"a.nick='"+login+"' and a.senha='"+senha+"'", Administrador.class);
        if(!administrador.isEmpty())
        {
            this.administradorLogado=administrador.get(0);
            this.tipoLogado="administrador";
            return "indexAdmin";
        }
        
        FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Erro ao logar",
                    "Login ou Senha não conferem"));
        
        return null;
        
    }
    
    public void logout(){
        
        this.usuarioLogado = new Usuario();
        this.administradorLogado=new Administrador();
        this.tipoLogado = "";       
        
    }

    public String getTipoLogado() {
        return tipoLogado;
    }

    public void setTipoLogado(String tipoLogado) {
        this.tipoLogado = tipoLogado;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Administrador getAdministradorLogado() {
        return administradorLogado;
    }

    public void setAdministradorLogado(Administrador administradorLogado) {
        this.administradorLogado = administradorLogado;
    }

    
    
}
