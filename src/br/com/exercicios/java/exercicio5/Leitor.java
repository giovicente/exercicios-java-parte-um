package br.com.exercicios.java.exercicio5;

import java.util.Scanner;

public class Leitor {
    private Scanner scanQuantidadeNotas, scanNota;
    private Impressora impressora = new Impressora();

    public int inserirQuantidadeNotas() {
        impressora.imprimirMensegemInserirQuantidadeNotas();
        scanQuantidadeNotas = new Scanner(System.in);
        int quantidadeNotas = scanQuantidadeNotas.nextInt();

        return quantidadeNotas;
    }

    public Integer inserirNota(int i) {
        impressora.imprimirMensegemInserirNotas(i);
        scanNota = new Scanner(System.in);
        Integer nota = scanNota.nextInt();

        return nota;
    }
}
