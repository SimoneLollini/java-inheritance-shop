package org.shop.java;


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
//    public Product() {
//        code = rand.nextInt( 1,1000);
//        name = "";
//        description ="";
//        price = new BigDecimal("0.00");
//        iva = new BigDecimal("0.00");
//    }

    public Product( String name, String description, BigDecimal price, BigDecimal iva) {
        this.code = rand.nextInt(1,1000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    @Override
    public String toString() {
        String str = "codice: " + getCode() + " nome: " + getName() + " " + " descrizione: " + getDescription() + " prezzo: " + getPrice();
        return str;
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
