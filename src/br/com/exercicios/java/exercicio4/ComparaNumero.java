package br.com.exercicios.java.exercicio4;

import java.util.Scanner;

public class ComparaNumero {

    public static void compararNumeros(int primeiroNumero, int segundoNumero) {
        if (primeiroNumero == segundoNumero) {
            Impressora.imprimirMensagemNumerosIguais();
        } else if (primeiroNumero > segundoNumero) {
            Impressora.imprimirNumeros(primeiroNumero, segundoNumero);
        } else {
            Impressora.imprimirNumeros(segundoNumero, primeiroNumero);
        }
    }

    public static int validarNumero(int numero) {

        if (numero < 0) {
            do {
                Impressora.imprimirMensagemNumeroInvalido();
                numero = Leitor.scanearNumero();
            } while (numero < 0);
        }

        return numero;
    }
}
