package br.com.exercicios.java.exercicio2;

import java.util.Scanner;

public class AppExercicioDois {

    public static void main(String[] args) {
        Scanner scanNumero = new Scanner(System.in);
        System.out.print("Digite o número que será impresso em ordem decrescente: ");
        int numero = scanNumero.nextInt();

        NumeroDecrescente.imprimirOrdemDecrescente(numero);
    }
}
