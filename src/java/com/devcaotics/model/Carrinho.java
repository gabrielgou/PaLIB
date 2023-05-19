/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Carrinho {
    private Carrinho myself;
    private List<Livro> livros; 
    private Carrinho()
    {
        this.livros=new ArrayList<>();
    }
    public Carrinho getCurrentInstance()
    {
        if(this.myself==null)
        {
            this.myself = new Carrinho();
        }
        return this.myself;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }       
}
