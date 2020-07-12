package br.com.exercicios.java.exercicio4;

import java.util.Scanner;

public class Leitor {

    public static int scanearNumero() {
        Scanner scanNumero = new Scanner(System.in);
        int numero = scanNumero.nextInt();

        return numero;
    }
}
