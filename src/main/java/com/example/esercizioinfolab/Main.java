package com.example.esercizioinfolab;

public class Main {
    public static void main(String[]args){
        Palestra p1 = new Palestra();

        p1.aggiungiAbbonamento(new AbbonamentoAnnuale("wow fitness"));
        System.out.println(p1.elencoAbbonamenti());
        System.out.println(p1.calcolaProfitto());
    }
}
