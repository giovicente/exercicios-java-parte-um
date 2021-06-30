package br.com.exercicios.java.exercicio3;

public class Calculadora {

    private final int VALOR_INICIAL = 1;
    private final int VALOR_FINAL = 30;

    private long multiplicacaoPares;
    private int somaImpares;

    public Calculadora() { }

    public Calculadora(long multiplicacaoPares, int somaImpares) {
        this.multiplicacaoPares = multiplicacaoPares;
        this.somaImpares = somaImpares;
    }

    public long getMultiplicacaoPares() { return multiplicacaoPares; }

    public int getSomaImpares() { return somaImpares; }

    public long multiplicarPares() {
        multiplicacaoPares = 1;

        for (int i = VALOR_INICIAL; i <= VALOR_FINAL; i++) {
            if (i % 2 == 0) multiplicacaoPares *= i;
        }

        return multiplicacaoPares;
    }

    public int somarImpares() {
        somaImpares = 0;

        for (int i = VALOR_INICIAL; i <= VALOR_FINAL; i++) {
            if (i % 2 != 0) somaImpares += i;
        }

        return somaImpares;
    }
}
