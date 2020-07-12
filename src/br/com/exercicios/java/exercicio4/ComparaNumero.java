package br.com.exercicios.java.exercicio4;

import java.util.Scanner;

public class ComparaNumero {

    Scanner scanNumero;

    public static void compararNumeros(int primeiroNumero, int segundoNumero) {
        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais!");
        } else if (primeiroNumero > segundoNumero) {
            imprimirNumeros(primeiroNumero, segundoNumero);
        } else {
            imprimirNumeros(segundoNumero, primeiroNumero);
        }
    }

    public static void imprimirNumeros(int maior, int menor) {
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }

    public int validarNumero(int numero) {
        scanNumero = new Scanner(System.in);

        if (numero < 0) {
            do {
                System.out.println("Número inválido, favor informar somente números positivos.");
                System.out.println("Digite novamente o número: ");
                numero = scanNumero.nextInt();
            } while (numero < 0);
        }

        return numero;
    }
}
