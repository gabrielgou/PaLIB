/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.validation;


import java.lang.annotation.Annotation;
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
@FacesValidator("nameValidator")
public class UsuarioValidation implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String validation = o.toString();
        if(!validation.contains(" ") || validation.length()<4)
        {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nome Incompleto",
                    "Preencha Corretamente"));
        }
    }    
    
}
