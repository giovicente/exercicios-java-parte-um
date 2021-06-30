package br.com.exercicios.java.exercicio5;

import java.util.ArrayList;

public class MediaAluno {

    private ArrayList<Integer> notas = new ArrayList<>();
    private Leitor leitor = new Leitor();

    public MediaAluno() { }

    public ArrayList<Integer> getNotas() { return notas; }

    public void setNotas(ArrayList<Integer> notas) { this.notas = notas; }

    public void adicionarNota(ArrayList<Integer> notas, Integer nota) { notas.add(nota); }

    public static boolean validarNota(Integer nota) {
        if (nota < 0 || nota > 100) {
            return false;
        }

        return true;
    }

    public ArrayList<Integer> carregarNotas(int quantidadeNotas) {
        for (int i = 0; i < quantidadeNotas; i++) {
            Integer nota = leitor.inserirNota(i);

            if (validarNota(nota)) {
                notas.add(nota);
            } else {
                while (!validarNota(nota)) {
                    nota = leitor.inserirNota(i);
                }
            }
        }

        return notas;
    }

    public Integer calcularMedia(ArrayList<Integer> notas) {
        Integer somaNotas = 0;

        for (int i = 0; i < notas.size(); i++) {
            somaNotas += notas.get(i);
        }

        Integer media = somaNotas / notas.size();

        return media;
    }
}
