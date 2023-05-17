/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devcaotics.model;

/**
 *
 * @author rapha
 */
public class Boleto {
    
    Double amount;
    String expire_at; //pecisa de regra para entrar no formato 2023-12-31
    String customer_person_name;
    String customer_cnpj_cpf; //precisa de regra para validação
    String customer_state;
    String customer_city_name;
    String customer_zipcode;
    String customer_address;
    String customer_neighborhood;

    public Boleto(Double amount, String expire_at, String customer_person_name, 
            String customer_cnpj_cpf, String customer_state, 
            String customer_city_name, String customer_zipcode, 
            String customer_address, String customer_neighborhood) {
        
        this.amount = amount;
        this.expire_at = expire_at;
        this.customer_person_name = customer_person_name;
        this.customer_cnpj_cpf = customer_cnpj_cpf;
        this.customer_state = customer_state;
        this.customer_city_name = customer_city_name;
        this.customer_zipcode = customer_zipcode;
        this.customer_address = customer_address;
        this.customer_neighborhood = customer_neighborhood;
    }
    

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    
    public String getExpire_at() {
        return expire_at;
    }

    public void setExpire_at(String expire_at) {
        this.expire_at = expire_at;
    }

    public String getCustomer_person_name() {
        return customer_person_name;
    }

    public void setCustomer_person_name(String customer_person_name) {
        this.customer_person_name = customer_person_name;
    }

    public String getCustomer_cnpj_cpf() {
        return customer_cnpj_cpf;
    }

    public void setCustomer_cnpj_cpf(String customer_cnpj_cpf) {
        this.customer_cnpj_cpf = customer_cnpj_cpf;
    }

    public String getCustomer_state() {
        return customer_state;
    }

    public void setCustomer_state(String customer_state) {
        this.customer_state = customer_state;
    }

    public String getCustomer_city_name() {
        return customer_city_name;
    }

    public void setCustomer_city_name(String customer_city_name) {
        this.customer_city_name = customer_city_name;
    }

    public String getCustomer_zipcode() {
        return customer_zipcode;
    }

    public void setCustomer_zipcode(String customer_zipcode) {
        this.customer_zipcode = customer_zipcode;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_neighborhood() {
        return customer_neighborhood;
    }

    public void setCustomer_neighborhood(String customer_neighborhood) {
        this.customer_neighborhood = customer_neighborhood;
    }
    
    
}
