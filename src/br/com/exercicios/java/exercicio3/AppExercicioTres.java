package br.com.exercicios.java.exercicio3;

public class AppExercicioTres {
    public static void main(String[] args) {

        final int VALOR_INICIAL = 1;
        final int VALOR_FINAL = 30;

        int somaImpares = 0;
        long multiplicacaoPares = 1;

        for (int i = VALOR_INICIAL; i <= VALOR_FINAL; i++) {
            if (i % 2 == 0) {
                multiplicacaoPares *= i;
            } else {
                somaImpares += i;
            }
        }

        System.out.println("A soma dos números ímpares entre 0 e 30 é: " + somaImpares);
        System.out.println("A multiplicação dos números pares entre 0 e 30 é: " + multiplicacaoPares);
    }
}
