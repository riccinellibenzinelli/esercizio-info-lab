package com.example.esercizioinfolab;

import java.util.ArrayList;

public class Palestra {
    private ArrayList<Abbonamento> abbonamenti;

    public Palestra() {
        abbonamenti = new ArrayList<>();
    }

    public void aggiungiAbbonamento(Abbonamento abbonamento) {
        abbonamenti.add(abbonamento);
    }

    public double calcolaProfitto() {
        double profitto = 0;
        for (Abbonamento abbonamento : abbonamenti) {
            profitto += abbonamento.getCosto();
        }
        return profitto;
    }

    public String elencoAbbonamenti() {
        StringBuilder sb = new StringBuilder();
        for (Abbonamento abbonamento : abbonamenti) {
            sb.append(abbonamento.getNome()).append(" - €").append(abbonamento.getCosto()).append("\n");
        }
        return sb.toString();
    }
}