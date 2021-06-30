package br.com.exercicios.java.exercicio2;

public class NumeroDecrescente {

    public static int imprimirOrdemDecrescente(int numero) {
        for(int i = numero; i >= 0; i--) {
            System.out.println(numero);
            numero--;
        }

        return numero;
    }
}
