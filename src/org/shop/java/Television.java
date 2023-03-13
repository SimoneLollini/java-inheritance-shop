package org.shop.java;
//        - Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

import java.math.BigDecimal;

public class Television extends Product{

    private BigDecimal height;

    private  BigDecimal width;

    private boolean smart;

    public Television( String name, String description, BigDecimal price, BigDecimal iva,BigDecimal height, BigDecimal width, boolean smart) {

        super(name,description, price, iva);
        this.smart = smart;

        this.height = height;
        this.width = width;

        }
    }

