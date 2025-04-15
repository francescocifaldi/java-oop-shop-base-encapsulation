package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // attributi
    private int codice;
    private String nome;
    private String marca;
    private double prezzoBase;
    private int iva;

    // costruttori
    public Prodotto(String nome, String marca, double prezzoBase, int iva) {
        Random random = new Random();
        this.codice = random.nextInt(9999);
        this.nome = nome;
        this.marca = marca;
        this.prezzoBase = prezzoBase;
        this.iva = iva;
    }

    public Prodotto() {
        Random random = new Random();
        this.codice = random.nextInt(9999);
        this.nome = "Prodotto senza nome";
        this.marca = "Prodotto senzaz marca";
        this.prezzoBase = 0;
        this.iva = 22;
    }

    // getter e setter
}
