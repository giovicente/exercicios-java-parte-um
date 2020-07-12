package br.com.exercicios.java.exercicio6;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() { }

    public ArrayList<Contato> getContatos() { return contatos; }

    public void setContatos(ArrayList<Contato> contatos) { this.contatos = contatos; }

    public void adicionarContato(ArrayList<Contato> contatos, Contato contato) { contatos.add(contato); }

    public Contato consultarContato(ArrayList<Contato> contatos, String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                return contatos.get(i);
            }
        }

        System.out.println("Contato não encontrado.");
        return null;
    }

    public boolean removerContato(ArrayList<Contato> contatos, String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                contatos.remove(i);
                return true;
            }
        }

        System.out.println("Contato não encontrado.");
        return false;
    }
}
