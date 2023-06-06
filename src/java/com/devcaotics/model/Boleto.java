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
    
  int interest_type = 0;
  int interest_days_type = 0;
  int fine_type= 0;
  int discount_type = 0;
  int charge_type= 1;
  int dispatch_type = 1;
  String document_type = "02";
  String acceptance = "N";
  Boolean prevent_pix= false;
  int instructions_mode =  1;

    public int getInterest_type() {
        return interest_type;
    }

    public void setInterest_type(int interest_type) {
        this.interest_type = interest_type;
    }

    public int getInterest_days_type() {
        return interest_days_type;
    }

    public void setInterest_days_type(int interest_days_type) {
        this.interest_days_type = interest_days_type;
    }

    public int getFine_type() {
        return fine_type;
    }

    public void setFine_type(int fine_type) {
        this.fine_type = fine_type;
    }

    public int getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(int discount_type) {
        this.discount_type = discount_type;
    }

    public int getCharge_type() {
        return charge_type;
    }

    public void setCharge_type(int charge_type) {
        this.charge_type = charge_type;
    }

    public int getDispatch_type() {
        return dispatch_type;
    }

    public void setDispatch_type(int dispatch_type) {
        this.dispatch_type = dispatch_type;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

    public Boolean getPrevent_pix() {
        return prevent_pix;
    }

    public void setPrevent_pix(Boolean prevent_pix) {
        this.prevent_pix = prevent_pix;
    }

    public int getInstructions_mode() {
        return instructions_mode;
    }

    public void setInstructions_mode(int instructions_mode) {
        this.instructions_mode = instructions_mode;
    }
    
    Double amount;
    String expire_at; //pecisa de regra para entrar no formato 2023-12-31
    String customer_person_name;
    String customer_cnpj_cpf; //precisa de regra para validação
    String customer_state;
    String customer_city_name;
    String customer_zipcode;
    String customer_address;
    String customer_neighborhood;

    public Boleto(Double amount, String expire_at, String customer_person_name, String customer_cnpj_cpf, String customer_state, String customer_city_name, String customer_zipcode, String customer_address, String customer_neighborhood) {
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

    public Boleto() {}
    

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
