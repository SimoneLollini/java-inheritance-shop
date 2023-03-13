package org.shop.java;
//        Lo shop gestisce diversi tipi di prodotto:
//
//        Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
//        Durante la richiesta di valorizzazione chiedete all’utente
//        se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//        Al termine dell’inserimento stampate il riepilogo del carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)



//        BONUS: Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%.
//        Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, altrimenti rimane del 2%.
//        Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%.
//        Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.
//        Nella classe Carrello chiedere all’utente se possiede una carta fedeltà
//        In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.

import java.math. BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
Random rand = new Random();

    //attributes
    private int code;
    private String name;
    private String description;
    private  BigDecimal price;

    private  BigDecimal iva;


    //constructors
    public Product() {
        code = rand.nextInt( 1,1000);
        name = "";
        description ="";
        price = new BigDecimal("0.00");
        iva = new BigDecimal("0.00");
    }

    public Product( String name, String description, BigDecimal price, BigDecimal iva) {
        this.code = rand.nextInt(1,1000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }


    //methods
    public BigDecimal getIvaPrice(){
        BigDecimal bgD = new BigDecimal("100");
        BigDecimal bgD1= new BigDecimal("1");
        return price.multiply((bgD1.add( (iva.divide(bgD, RoundingMode.CEILING)) )));
    }

}
