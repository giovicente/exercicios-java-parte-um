package br.com.exercicios.java.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class AppExercicioCinco {

    public static void main(String[] args) {
        Scanner scanNumeroNotas = new Scanner(System.in);
        Scanner scanNota = new Scanner(System.in);

        MediaAluno mediaAluno = new MediaAluno();

        System.out.println("Digite o número de notas para adicionar: ");
        int numeroNotas = scanNumeroNotas.nextInt();

        int nota = 0;

        ArrayList<Integer> notas = new ArrayList<>();

        mediaAluno.setNotas(notas);

        for (int i = 0; i < numeroNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            nota = scanNota.nextInt();
            if (MediaAluno.validarNota(nota)) {
                mediaAluno.adicionarNota(mediaAluno.getNotas(), nota);
            } else {
                while (!MediaAluno.validarNota(nota)) {
                    System.out.println("Nota inválida, adicione outra nota com o valor entre 0 e 100.");
                    nota = scanNota.nextInt();
                }
                mediaAluno.adicionarNota(mediaAluno.getNotas(), nota);
            }
        }

        Integer media = mediaAluno.calcularMedia(notas);

        System.out.println("A média do aluno é: " + media);
    }
}
