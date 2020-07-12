package br.com.exercicios.java.exercicio4;

public class Impressora {

    public static void imprimirMensagemPrimeiroNumero() {
        System.out.println("Digite o primeiro número: ");
    }

    public static void imprimirMensagemSegundoNumero() {
        System.out.println("Digite o segundo número: ");
    }

    public static void imprimirMensagemNumerosIguais() {
        System.out.println("Os números são iguais!");
    }

    public static void imprimirNumeros(int maior, int menor) {
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }

    public static void imprimirMensagemNumeroInvalido() {
        System.out.println("Número inválido, favor informar somente números positivos.");
        System.out.println("Digite novamente o número: ");
    }
}
