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
        this.selLivro = new Livro();
        selLivro.setNome("Teste");
        selLivro.setAutor("Teste");
        selLivro.setCategoria("Teste");
        selLivro.setSinopse("Teste");
        selLivro.setPreco(2.5);
        ManagerDao.getCurrentInstance().insert(selLivro);

        Endereco ed = new Endereco();
        ed.setBairro("Teste");
        ed.setCidade("Teste");
        ed.setNome("Teste");
        ed.setNumero("Teste");
        ed.setUser(usuarioLogado);
        ManagerDao.getCurrentInstance().insert(ed);

        this.usuarioLogado = new Usuario();
        usuarioLogado.setApelido("Teste");
        usuarioLogado.setCpf("Teste");
        usuarioLogado.setEndereco(ed);
        usuarioLogado.setNome("Teste");
        usuarioLogado.setSenha("123");
        usuarioLogado.setTelefone("123123123");
        ManagerDao.getCurrentInstance().insert(usuarioLogado);

        this.cobranca = null;
    }

    public String fazerCompra() {
        this.cobranca = new Cobranca();
        this.cobranca.setComprador(this.usuarioLogado);
        this.cobranca.setLivro(this.selLivro);
        this.cobranca.setValor(this.selLivro.getPreco());
        this.cobranca.setIsPago(false);

        ManagerDao.getCurrentInstance().insert(this.cobranca);

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Cobrança criada, confirme o pagamento!"));

        return "indexCobranca";
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
