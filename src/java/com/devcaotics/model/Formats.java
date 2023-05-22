/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author José Alfredo
 */
public class Formats{
    @JsonProperty("default") 
    public String mydefault;
    public String png;
    public String pdf;
    public String boleto_hibrido;
    public String boleto_pix;
    public String barcode;
    public String envelope;
    public String letter;
    public String line;
    public String recibo;

    public Formats(String mydefault, String png, String pdf, String boleto_hibrido, String boleto_pix, String barcode, String envelope, String letter, String line, String recibo) {
        this.mydefault = mydefault;
        this.png = png;
        this.pdf = pdf;
        this.boleto_hibrido = boleto_hibrido;
        this.boleto_pix = boleto_pix;
        this.barcode = barcode;
        this.envelope = envelope;
        this.letter = letter;
        this.line = line;
        this.recibo = recibo;
    }

    public Formats() {
    }

    
    
    public String getMydefault() {
        return mydefault;
    }

    public void setMydefault(String mydefault) {
        this.mydefault = mydefault;
    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getBoleto_hibrido() {
        return boleto_hibrido;
    }

    public void setBoleto_hibrido(String boleto_hibrido) {
        this.boleto_hibrido = boleto_hibrido;
    }

    public String getBoleto_pix() {
        return boleto_pix;
    }

    public void setBoleto_pix(String boleto_pix) {
        this.boleto_pix = boleto_pix;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getEnvelope() {
        return envelope;
    }

    public void setEnvelope(String envelope) {
        this.envelope = envelope;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }
    
    
}
