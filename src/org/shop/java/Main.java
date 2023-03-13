package org.shop.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product[] products = new Product[3]; // creo un array in cui inseriró 5 prodotti

//        System.out.println(Arrays.toString(products));

        for (int i = 0; i < products.length; i++) {
            System.out.println(" ");
            products[i] = new Product();
            System.out.println( "codice prodotto: " + products[i].getCode());

            System.out.print("Nome prodotto: ");
            String name = "smartphone 1";
            products[i].setName(name); //set product's name

            System.out.print("Descrizione prodotto: ");
            String description = "uno smartphone bellissimo";
            products[i].setDescription(description); //set product's description

            System.out.print("price prodotto: ");
            BigDecimal price = BigDecimal.valueOf(255.99);
            products[i].setPrice(price); //set product's price

            System.out.print("Iva prodotto: ");
            BigDecimal iva = BigDecimal.valueOf(22);
            products[i].setIva(iva); //set product's iva


            System.out.print("Nome: ");
            System.out.println(products[i].getName());

            System.out.print("Descrizione: ");
            System.out.println(products[i].getDescription());

            System.out.print("Prezzo: ");
            System.out.println(products[i].getPrice());

            System.out.print("Iva: ");
            System.out.println(products[i].getIva() + "%");

            System.out.print("Prezzo compreso iva: ");
            System.out.println(products[i].getIvaPrice());


        }
    }
}