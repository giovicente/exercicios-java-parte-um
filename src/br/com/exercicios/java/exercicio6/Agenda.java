package br.com.exercicios.java.exercicio6;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<>();
    private Escritor escritor = new Escritor();

    public Agenda() { }

    public ArrayList<Contato> getContatos() { return contatos; }

    public void setContatos(ArrayList<Contato> contatos) { this.contatos = contatos; }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        escritor.escreverRetornoInclusaoContato(contato);
    }

    public Contato consultarContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                return contatos.get(i);
            }
        }

        escritor.escreverContatoNaoEncontrado();
        return null;
    }

    public boolean removerContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                contatos.remove(i);
                escritor.escreverContatoRemovidoComSucesso();
                return true;
            }
        }

        escritor.escreverContatoNaoEncontrado();
        return false;
    }
}
