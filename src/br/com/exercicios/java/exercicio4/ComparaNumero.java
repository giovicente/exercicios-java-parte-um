package br.com.exercicios.java.exercicio4;

public class ComparaNumero {

    public static int compararNumeros(int primeiroNumero, int segundoNumero) {
        if (primeiroNumero == segundoNumero) {
            Impressora.imprimirMensagemNumerosIguais();
            return 0;
        } else if (primeiroNumero > segundoNumero) {
            Impressora.imprimirNumeros(primeiroNumero, segundoNumero);
            return primeiroNumero;
        } else {
            Impressora.imprimirNumeros(segundoNumero, primeiroNumero);
            return segundoNumero;
        }
    }

    public static int validarNumero(int numero) {

        if (numero < 0) {
            do {
                Impressora.imprimirMensagemNumeroInvalido();
                numero = Leitor.scanearNumero();
            } while (numero < 0);
        }

        return numero;
    }
}
