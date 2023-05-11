/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Cobranca;
import com.devcaotics.model.Endereco;
import com.devcaotics.model.Livro;
import com.devcaotics.model.Usuario;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author angelomig
 */
@ManagedBean(name = "compraLivroController")
@SessionScoped
public class CompraLivroController implements Serializable {

    private Livro selLivro;
    private Usuario usuarioLogado;
    private Cobranca cobranca;

    @PostConstruct
    public void init() {
        this.selLivro=null;
        this.usuarioLogado=null;
        this.cobranca = new Cobranca();
    }

    public void fazerCompra() {
        this.usuarioLogado = ((LoginController)((HttpSession)(FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        System.out.println("Usuario: " + usuarioLogado.getNome());
        System.out.println("Livro: " + selLivro.getNome());
        
        this.cobranca.setComprador(this.usuarioLogado);
        this.cobranca.setLivro(this.selLivro);
        this.cobranca.setValor(this.selLivro.getPreco());
        this.cobranca.setIsPago(false);
            
        ManagerDao.getCurrentInstance().insert(this.cobranca);
        this.cobranca = new Cobranca();
        FacesContext.getCurrentInstance()
                    .addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO, "Adicionado Ao Carrinho",
                    "Finalize para gerar uma nova cobrança"));
    }

    public String realizarPagamento(boolean isPago) {
        if (isPago) {
            this.cobranca.setIsPago(isPago);
            this.usuarioLogado.getLivros().add(this.cobranca.getLivro());

            ManagerDao.getCurrentInstance().update(this.cobranca);
            ManagerDao.getCurrentInstance().update(this.usuarioLogado);

            this.cobranca = new Cobranca();

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Pagamento feito, sua compra foi realizada !"));
            return "indexLivrosComprados";
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "Pagamento recusado!"));
            return "indexCobranca";
        }
    }

    public Livro getSelLivro() {
        return selLivro;
    }

    public void setSelLivro(Livro selLivro) {
        this.selLivro = selLivro;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Cobranca getCobranca() {
        return cobranca;
    }

    public void setCobranca(Cobranca cobranca) {
        this.cobranca = cobranca;
    }

}
