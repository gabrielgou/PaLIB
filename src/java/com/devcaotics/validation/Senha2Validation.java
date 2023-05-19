/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.validation;


import com.devcaotics.controllers.UsuarioController;
import com.devcaotics.model.Usuario;
import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.validator.*;
import javax.servlet.http.HttpSession;
import org.primefaces.convert.PatternReader;

/**
 *
 * @author gabri
 */
@FacesValidator("senha2Validator")
public class Senha2Validation implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String senha = o.toString();
        Usuario uc = ((UsuarioController)((HttpSession)(FacesContext.
                getCurrentInstance().getExternalContext().getSession(true))).
                getAttribute("usuarioController")).getUser(); 
        if(!senha.equals(uc.getSenha()))
       {
           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro!","Preencha celular corretamente."));
       }
    }
    
}
