/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.validation;


import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.validator.*;
import org.primefaces.convert.PatternReader;

/**
 *
 * @author gabri
 */
@FacesValidator("senhaValidator")
public class SenhaValidation implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String senha = o.toString();
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$");
        Matcher matcher = pattern.matcher(senha);
        if(!matcher.matches())
       {
           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro!","Preencha celular corretamente."));
       }
    }
    
}
