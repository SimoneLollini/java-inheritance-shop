package org.shop.java;

import java.math.BigDecimal;

//        - Cuffie, caratterizzate dal colore e se sono wireless o cablate
public class Headset extends Product{

    private String[] color;

    private boolean wireless;



    public Headset( String name, String description, BigDecimal price, BigDecimal iva, boolean wireless, String[] color) {

        super(name,description, price, iva);
        this.wireless = wireless;

        this.color = new String[color.length];
        for (int i = 0; i < color.length; i++) {
            this.color[i] = color[i];
        }
    }
}
