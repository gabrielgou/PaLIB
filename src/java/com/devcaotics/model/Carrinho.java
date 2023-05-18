/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model;

import java.util.List;

/**
 *
 * @author gabri
 */
public class Carrinho {
    private Carrinho myself;
    private Carrinho()
    {
        
    }
    public Carrinho getCurrentInstance()
    {
        if(myself==null)
        {
            myself = new Carrinho();
        }
        return this.myself;
    }
    private List<Livro> livros;    
}
