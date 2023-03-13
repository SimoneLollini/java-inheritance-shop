package org.shop.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//        Al termine dell’inserimento stampate il riepilogo del carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)



//        BONUS: Aggiungete alla classe Prodotto un metodo per il calcolo del prezzo scontato per clienti con tessera fedeltà, che applica al prezzo uno sconto del 2%.
//        Per gli Smartphone, lo sconto è del 5% se la quantità di memoria è inferiore a 32GB, altrimenti rimane del 2%.
//        Per i Televisori lo sconto è del 10% se la televisione non è smart, altrimenti rimane del 2%.
//        Per le Cuffie lo sconto è del 7% se sono cablate, altrimenti rimane del 2%.
//        Nella classe Carrello chiedere all’utente se possiede una carta fedeltà
//        In base alla risposta, calcolare il totale del carrello come somma dei prezzi base o dei prezzi scontati.
public class Carrello {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product[] products = new Product[10]; // creo un array in cui inseriró massimo 10 prodotti

//        System.out.println(Arrays.toString(products));

        System.out.println("Quanti prodotti vuoi aggiungere al carrello? (max 10)");
        int loops = scan.nextInt();

        for (int i = 0; i < loops; i++) {
            System.out.print("Che tipo di prodotto vuoi aggiungere? (Smartphone: \"s\", Televisore: \"t\", Cuffie: \"c\"");
            String product_type = scan.next();

            System.out.println("nome");
            String name = scan.next();

            System.out.println("descrizione");
            String description = scan.next();

            System.out.println("prezzo");
            BigDecimal price = scan.nextBigDecimal();

            System.out.println("iva");
            BigDecimal iva = scan.nextBigDecimal();



           switch (product_type.toLowerCase()) {
               case "s":
                   // smartphone

                   System.out.println("storage");
                   BigDecimal storage = scan.nextBigDecimal();
                   products[i] = new Smartphone(name, description, price, iva, storage);

                   break;
               case "t":
                   // code tv
                   System.out.println("height");
                   BigDecimal height = scan.nextBigDecimal();
                   System.out.println("width");
                   BigDecimal width = scan.nextBigDecimal();
                   System.out.println("smart: true or false");
                   boolean smart = scan.nextBoolean();

                   products[i] =  new Television(name, description, price, iva, height, width,smart);

                   break;
               case "c":
                   // code cuffie
                   System.out.println("Wireless: true or false");
                   boolean wireless = scan.nextBoolean();
                   System.out.println("Colore: ");
                   String color = scan.next();
                   products[i] =  new Headset(name, description, price, iva,  wireless, color);
                   break;
               default:
                   System.out.println("non esiste nessuna categoria con questo nome");
           }
           scan.close();

            System.out.println(Arrays.toString(products));

        }
    }
}