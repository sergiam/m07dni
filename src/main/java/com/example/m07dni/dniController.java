package com.example.m07dni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dniController {

    public Label dniGenerat;

    public Label errorMultiplicador;

    public TextField nom;
    public TextField cognom;
    @FXML
    public TextField multiplicador;
    public Label nomText;
    public Label cognomText;
    public Label multiplicadorText;
    public Label avis;
    private final char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

    private final char[] letraDNI = {'t','r','w','a','g','m','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e'};


    @FXML
    protected void generateDNI() {

        System.out.println("va");
        int nummultiplicador = Integer.parseInt(multiplicador.getText());
        if (nummultiplicador < 1 || nummultiplicador > 9) {
            errorMultiplicador.setText("Posa un valor comprès entre l'1 i el 9 :)");
            dniGenerat.setVisible(false);
            errorMultiplicador.setVisible(true);
        } else if (nom.getText().equals("") || nom.getText().length() <= 7 && cognom.getText().equals("")) {
            avis.setText("Introdueix valors que arribin a 7 caràcters als camps!");
            avis.setVisible(true);
            dniGenerat.setVisible(false);
        } else {
            calcularDNI();
            errorMultiplicador.setVisible(false);
            avis.setVisible(false);
            dniGenerat.setVisible(true);
        }
    }

    protected void calcularDNI() {
        StringBuilder posicion = new StringBuilder();
        String nombreapellido = nom.getText() + cognom.getText();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < alfabet.length; j++) {
                if (nombreapellido.charAt(i) == alfabet[j]) {
                    posicion.append(j % 10);
                }
            }
        }

        int numeros = Integer.parseInt(posicion.toString());
        numeros = numeros * Integer.parseInt(multiplicador.getText());
        int numerodni = numeros % 23;
        String dnicomplet = String.valueOf(numeros);
        if (dnicomplet.length() <= 7) {
            dnicomplet+="0";
            dniGenerat.setText("DNI GENERAT: " + dnicomplet);

        }
        dnicomplet += letraDNI[numerodni];
        dniGenerat.setText("DNI GENERAT: " + dnicomplet);
        }

    public void deleteDNI() {
        dniGenerat.setText("");
    }
}
