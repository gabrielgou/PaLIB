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

/**
 *
 * @author gabri
 */
@FacesValidator("cepValidator")
public class CEPValidation implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String cep = o.toString();
        Pattern pattern = Pattern.compile("^\\d{2}\\d{3}\\d{3}$");
        Matcher matcher = pattern.matcher(cep);
        if(!matcher.matches())
       {
           throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro!","Preencha CEP corretamente."));
       }
    }
    
}
