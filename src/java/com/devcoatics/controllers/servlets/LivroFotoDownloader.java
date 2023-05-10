/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcoatics.controllers.servlets;

import com.devcaotics.dao.ManagerDao;
import com.devcaotics.model.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALUNO
 */
@WebServlet(name = "LivroFotoDownloader", urlPatterns = {"/LivroFotoDownloader"})
public class LivroFotoDownloader extends HttpServlet {

    

    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        int idLivro = Integer.parseInt(request.getParameter("idLivro"));
        
        Livro l = (Livro)ManagerDao.getCurrentInstance().
                read("select l from Livro l where l.id="+idLivro, Livro.class).get(0);
        
            response.setContentType("image/jpeg");
        
            response.getOutputStream().write(l.getCapa(), 0, l.getCapa().length);
        }
        
        
    }

