package br.com.exercicios.java.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class AppExercicioCinco {

    public static void main(String[] args) {
        MediaAluno mediaAluno = new MediaAluno();
        Leitor leitor = new Leitor();
        Impressora impressora = new Impressora();

        int numeroNotas = leitor.inserirQuantidadeNotas();
        ArrayList<Integer> notas = mediaAluno.carregarNotas(numeroNotas);
        Integer media = mediaAluno.calcularMedia(notas);

        impressora.imprimirRetornoMedia(media);
    }
}
