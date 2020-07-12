package br.com.exercicios.java.exercicio1;

public class MaiorNumero {

    public static void imprimirMaiorNumero(int primeiroNumero, int segundoNumero) {

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é " + primeiroNumero + ".");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O maior número é " + segundoNumero + ".");
        } else {
            System.out.println("Os números são iguais.");
        }

    }

}
