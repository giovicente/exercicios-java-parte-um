package br.com.exercicios.java.exercicio4;

import java.util.Scanner;

public class AppExercicioQuatro {

    public static void main(String[] args) {
        Scanner scanPrimeiroNumero = new Scanner(System.in);
        Scanner scanSegundoNumero = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanPrimeiroNumero.nextInt();

        ComparaNumero comparaNumero = new ComparaNumero();
        primeiroNumero = comparaNumero.validarNumero(primeiroNumero);

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanSegundoNumero.nextInt();
        segundoNumero = comparaNumero.validarNumero(segundoNumero);

        ComparaNumero.compararNumeros(primeiroNumero, segundoNumero);
    }
}
