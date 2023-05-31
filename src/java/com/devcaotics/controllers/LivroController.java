/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers;
import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Livro;
import com.devcaotics.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author gabri
 */
@ManagedBean(name = "livroController")
@SessionScoped
public class LivroController implements Serializable {
    private Livro livro;
    private Livro selLivro;
    private byte[] binaryPhoto;
    private byte[] binaryPDF;
     @PostConstruct
    public void init()
    {
        this.livro = new Livro();
    }
    public String cadastrar()
    {
        if(livro.getNome()==null)
        {
             FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro!","Livro sem nome!"));
             return null;
        }
        livro.setCapa(binaryPhoto);
        livro.setPDF(binaryPDF);
        ManagerDao.getCurrentInstance().insert(this.livro);
        livro = new Livro();
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","Livro cadastrado com sucesso!"));
        return "indexLivro";
              
    }
    public void handleFotoLivro(FileUploadEvent event){
        this.binaryPhoto = (event.getFile().getContent());        
        FacesContext.getCurrentInstance().addMessage("formCadLivro:fotoUploader", new FacesMessage("Foto inserida com sucesso"));
    }
    public void handlePDFLivro(FileUploadEvent event){
        this.binaryPDF = (event.getFile().getContent());        
        FacesContext.getCurrentInstance().addMessage("formCadLivro:pdfUploader", new FacesMessage("Upload de PDF com sucesso"));
    }
    
    public List<Livro> readAll(){
        
        List<Livro> livros = ManagerDao.getCurrentInstance()
                .read("select l from Livro l", 
                        Livro.class);
        return livros;
    }
     public boolean existsBookFromUser(long id){
        Usuario logado = ((LoginController)((HttpSession)(FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("loginController")).getUsuarioLogado();
        List<Usuario> user =  ManagerDao.getCurrentInstance()
                .read("select u from Usuario u JOIN u.livros l where l.id="+id+" and u.id="+logado.getId(), 
                        Usuario.class);
        return user.isEmpty()==false?false:true;
    }
    public void clearSelection(){
        
        this.selLivro = null;
       
    }
    public void alterar(){
        
        ManagerDao.getCurrentInstance().update(this.selLivro);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Livro alterado com sucesso!"));
                
    }
    public void deletar(){
        ManagerDao.getCurrentInstance().delete(this.selLivro);
    
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Livro deletado com sucesso!"));
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Livro getSelLivro() {
        return selLivro;
    }

    public void setSelLivro(Livro selLivro) {
        this.selLivro = selLivro;
    }

    public byte[] getBinaryPhoto() {
        return binaryPhoto;
    }

    public void setBinaryPhoto(byte[] binaryPhoto) {
        this.binaryPhoto = binaryPhoto;
    }

    public byte[] getBinaryPDF() {
        return binaryPDF;
    }

    public void setBinaryPDF(byte[] binaryPDF) {
        this.binaryPDF = binaryPDF;
    }
    
    
    
}
