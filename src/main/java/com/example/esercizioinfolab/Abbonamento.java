package com.example.esercizioinfolab;

public abstract class Abbonamento {
    protected String nome;
    protected double costo;

    public Abbonamento(String nome, double costo) {
        this.nome = nome;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public String getNome() {
        return nome;
    }


}