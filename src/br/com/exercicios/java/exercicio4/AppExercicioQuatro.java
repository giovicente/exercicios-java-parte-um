package br.com.exercicios.java.exercicio4;

public class AppExercicioQuatro {

    public static void main(String[] args) {
        Impressora.imprimirMensagemPrimeiroNumero();
        int primeiroNumero = Leitor.scanearNumero();
        primeiroNumero = ComparaNumero.validarNumero(primeiroNumero);

        Impressora.imprimirMensagemSegundoNumero();
        int segundoNumero = Leitor.scanearNumero();
        segundoNumero = ComparaNumero.validarNumero(segundoNumero);

        ComparaNumero.compararNumeros(primeiroNumero, segundoNumero);
    }
}
