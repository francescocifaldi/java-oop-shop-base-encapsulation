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
        this.marca = "Prodotto senza marca";
        this.prezzoBase = 0;
        this.iva = 22;
    }

    // getter e setter
    public int getCodice() {
        return codice;
    }

    public void setNome(String nome) {
        nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        marca = marca.substring(0, 1).toUpperCase() + marca.substring(1).toLowerCase();
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrezzoBase(double prezzoBase) {
        if (prezzoBase < 0) {
            prezzoBase = 0;
        }
        this.prezzoBase = prezzoBase;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public void setIva(int iva) {
        if (iva < 0) {
            iva = 0;
        } else if (iva > 100) {
            iva = 100;
        }
        this.iva = iva;
    }

    public int getIva() {
        return iva;
    }

    // metodi
    public String getFullName() {
        return this.codice + "-" + this.nome;
    }

    public double getPrezzoFinale() {
        return this.prezzoBase + (this.prezzoBase * this.iva / 100);
    }
}
