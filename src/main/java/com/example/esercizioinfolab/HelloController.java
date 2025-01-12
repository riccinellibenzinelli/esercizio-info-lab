package com.example.esercizioinfolab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class HelloController {
    @FXML
    private TextField nomeAbbonamento;
    @FXML
    private Button btnMensile;
    @FXML
    private Button btnAnnuale;
    @FXML
    private Button btnProfitto;
    @FXML
    private TextArea textArea;

    private Palestra palestra;

    public void initialize() {
        palestra = new Palestra();
    }

    @FXML
    private void aggiungiAbbonamentoMensile() {
        String nome = nomeAbbonamento.getText();
        if (!nome.trim().isEmpty()) {
            palestra.aggiungiAbbonamento(new AbbonamentoMensile(nome));
            aggiornaTextArea();
            nomeAbbonamento.clear();
        } else {
            mostraAvviso("Inserisci un nome valido.");
        }
    }

    @FXML
    private void aggiungiAbbonamentoAnnuale() {
        String nome = nomeAbbonamento.getText();
        if (!nome.trim().isEmpty()) {
            palestra.aggiungiAbbonamento(new AbbonamentoAnnuale(nome));
            aggiornaTextArea();
            nomeAbbonamento.clear();
        } else {
            mostraAvviso("Inserisci un nome valido.");
        }
    }
}
