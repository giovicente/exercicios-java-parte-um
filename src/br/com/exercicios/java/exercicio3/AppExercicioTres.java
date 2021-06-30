package br.com.exercicios.java.exercicio3;

public class AppExercicioTres {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int somaImpares = calculadora.somarImpares();
        long multiplicacaoPares = calculadora.multiplicarPares();

        System.out.println("A soma dos números ímpares entre 0 e 30 é: " + somaImpares);
        System.out.println("A multiplicação dos números pares entre 0 e 30 é: " + multiplicacaoPares);
    }
}
