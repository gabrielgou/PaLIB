/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Livro;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean(name = "FileDownload")
@RequestScoped
public class FileDownloadView {
    
    private StreamedContent file;

    public FileDownloadView() {
         
    }

    public StreamedContent getFile(int idLivro) {
        Livro l = (Livro)ManagerDao.getCurrentInstance().
                read("select l from Livro l where l.id="+idLivro, Livro.class).get(0);
        String nomeLivro = l.getNome();
        nomeLivro.replaceAll(" ", "_");
        InputStream in = new ByteArrayInputStream(l.getPDF());
        file = DefaultStreamedContent.builder()
                .name(nomeLivro+".pdf")
                .contentType("application/pdf")
                .stream(() -> {
             return in;
         })
                .build();
        return file;
    }
}