package br.com.exercicios.java.exercicio1;

public class MaiorNumero {

    public static int imprimirMaiorNumero(int primeiroNumero, int segundoNumero) {

        if (primeiroNumero > segundoNumero) {
            System.out.println("O maior número é " + primeiroNumero + ".");
            return primeiroNumero;
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O maior número é " + segundoNumero + ".");
            return segundoNumero;
        } else {
            System.out.println("Os números são iguais.");
            return 0;
        }
    }
}
