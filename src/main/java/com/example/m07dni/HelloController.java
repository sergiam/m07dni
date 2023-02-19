package com.example.m07dni;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public Label dniGenerat;

    public Label errorMultiplicador;

    componente componente = new componente();

    private final char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

    private final char[] letraDNI = {'t','r','w','a','g','m','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e'};
    @FXML
    protected void generateDNI() {

        System.out.println("va");
        int nummultiplicador = Integer.parseInt(componente.multiplicador.getText());
        if (nummultiplicador < 1 || nummultiplicador > 9) {
            errorMultiplicador.setText("Posa un valor comprès entre l'1 i el 9 :)");
        } else {
            calcularDNI();
            errorMultiplicador.setVisible(false);
        }
    }

    protected void calcularDNI() {
        StringBuilder posicion = new StringBuilder();
        String nombreapellido = componente.nom.getText() + componente.cognom.getText();
        System.out.println(nombreapellido);


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < alfabet.length; j++) {
                if (nombreapellido.charAt(i) == alfabet[j]) {
                    posicion.append(j % 10);
                }
            }
        }


        int numeros = Integer.parseInt(posicion.toString());
        numeros = numeros * Integer.parseInt(componente.multiplicador.getText());
        int numerodni = numeros % 23;
        String dnilol = String.valueOf(numeros);

        dnilol += letraDNI[numerodni];
        System.out.println(posicion);
        System.out.println("dni completoooooooo: " + dnilol);

            dniGenerat.setText("DNI GENERAT: " + dnilol);

    }
}