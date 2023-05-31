/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Pedido;
import com.devcaotics.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

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
        
        return pedidos;
    }
}
