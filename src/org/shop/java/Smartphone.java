package org.shop.java;

import java.math.BigDecimal;

// - Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
public class Smartphone extends Product{

    private int IMEI;
    private BigDecimal storage;


    public Smartphone( String name, String description, BigDecimal price, BigDecimal iva, BigDecimal storage) {

        super(name,description, price, iva);

        this.storage = storage;

        this.IMEI = rand.nextInt(500,50000000);


    }

}
