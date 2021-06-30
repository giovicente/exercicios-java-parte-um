package br.com.exercicios.java.exercicio1;

import java.util.Scanner;

public class AppExercicioUm {
    public static void main(String[] args) {
        Scanner scanPrimeiroNumero = new Scanner(System.in);
        Scanner scanSegundoNumero = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanPrimeiroNumero.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanSegundoNumero.nextInt();

        int maiorNumero = MaiorNumero.imprimirMaiorNumero(primeiroNumero, segundoNumero);
    }
}
