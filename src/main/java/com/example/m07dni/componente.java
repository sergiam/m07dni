package com.example.m07dni;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class componente {
    public TextField nom;
    public TextField cognom;
    @FXML
    public TextField multiplicador;
    public Label nomText;
    public Label cognomText;
    public Label multiplicadorText;

    public TextField getNom() {
        return nom;
    }

    public void setNom(TextField nom) {
        this.nom = nom;
    }

    public TextField getCognom() {
        return cognom;
    }

    public void setCognom(TextField cognom) {
        this.cognom = cognom;
    }

    public TextField getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(TextField multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Label getNomText() {
        return nomText;
    }

    public void setNomText(Label nomText) {
        this.nomText = nomText;
    }

    public Label getCognomText() {
        return cognomText;
    }

    public void setCognomText(Label cognomText) {
        this.cognomText = cognomText;
    }

    public Label getMultiplicadorText() {
        return multiplicadorText;
    }

    public void setMultiplicadorText(Label multiplicadorText) {
        this.multiplicadorText = multiplicadorText;
    }
}
