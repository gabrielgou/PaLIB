/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model;

/**
 *
 * @author José Alfredo
 */
public class Pagamento {
    private double paid_amount;
    private String paid_at;

    public Pagamento(double paid_amount, String paid_at) {
        this.paid_amount = paid_amount;
        this.paid_at = paid_at;
    }
    
    public Pagamento(){}

    public double getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(double paid_amount) {
        this.paid_amount = paid_amount;
    }

    public String getPaid_at() {
        return paid_at;
    }

    public void setPaid_at(String paid_at) {
        this.paid_at = paid_at;
    }
}
