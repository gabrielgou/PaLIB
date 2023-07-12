/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Avaliacao;
import com.devcaotics.model.Livro;
import com.devcaotics.model.Pedido;
import com.devcaotics.model.Usuario;
import java.io.Serializable;
import static java.lang.Integer.getInteger;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RateEvent;

/**
 *
 * @author gabri
 */
@ManagedBean(name = "avaliacaoController")
@SessionScoped
public class AvaliacaoController implements Serializable {
    private Avaliacao avaliacao;
    private Avaliacao selAvaliacao;
    private int rating;
    @PostConstruct
    public void init() {
       this.avaliacao=new Avaliacao();
    }
    public void onrate(RateEvent<Integer> rateEvent) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Avaliação: ", "Você avaliou em:" + rateEvent.getRating()+" estrelas");
        this.rating = rateEvent.getRating();
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    public void cadastrar(long idLivro) {
        Usuario logado = ((LoginController) ((HttpSession) (FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        Livro l = (Livro) ManagerDao.getCurrentInstance()
                .read("select l from Livro l where l.id="+idLivro, Livro.class).get(0);
        avaliacao.setLivro(l);
        avaliacao.setUser(logado);
        avaliacao.setRating(rating);
        l.getAvaliacao().add(avaliacao);
        logado.getAvaliacao().add(avaliacao);
        ManagerDao.getCurrentInstance().insert(avaliacao);
        ManagerDao.getCurrentInstance().update(logado);
        ManagerDao.getCurrentInstance().update(l);
        avaliacao=new Avaliacao();
    }

    public List<Avaliacao> readAll() {

        List<Avaliacao> avaliacoes = ManagerDao.getCurrentInstance()
                .read("select a from Avaliacao a",
                        Avaliacao.class);
        return avaliacoes;
    }
    public int readRatingFromUser(long idLivro) {
         Usuario logado = ((LoginController) ((HttpSession) (FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        List<Avaliacao> av = ManagerDao.getCurrentInstance()
                .read("select a from Avaliacao a where a.user.id="+logado.getId()+" and a.livro.id="+idLivro,
                        Avaliacao.class);
        if(av.isEmpty())
            return 0;
        return av.get(0).getRating();
    }
    public boolean foiAvaliado(long idLivro)
    {
        Usuario logado = ((LoginController) ((HttpSession) (FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        List<Avaliacao> av = ManagerDao.getCurrentInstance()
                .read("select a from Avaliacao a where a.user.id="+logado.getId()+" and a.livro.id="+idLivro,
                        Avaliacao.class);
        return !av.isEmpty();
    }
    public int readAllFromLivro(int idLivro) {
        Usuario logado = ((LoginController) ((HttpSession) (FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        List<Avaliacao> av = ManagerDao.getCurrentInstance()
                .read("select a from Avaliacao a where a.livro.id="+idLivro, Avaliacao.class);
        int media=0;
        int count=0;
        for(Avaliacao i : av)
        {
            media+=i.getRating();
            count++;
        }
        return media/count;
    }

    public List<Livro> readAllFromUser() {
        Usuario logado = ((LoginController) ((HttpSession) (FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        
        return logado.getLivros();
    }

   
    public void clearSelection() {

        this.selAvaliacao= null;

    }

    public void alterar() {

        ManagerDao.getCurrentInstance().update(this.selAvaliacao);

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Avaliação alterada com sucesso!"));

    }

    public void deletar() {
        ManagerDao.getCurrentInstance().delete(this.selAvaliacao);

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Avaliação deletada com sucesso!"));
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Avaliacao getSelAvaliacao() {
        return selAvaliacao;
    }

    public void setSelAvaliacao(Avaliacao selAvaliacao) {
        this.selAvaliacao = selAvaliacao;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
}
