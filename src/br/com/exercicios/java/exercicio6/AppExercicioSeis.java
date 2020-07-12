package br.com.exercicios.java.exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class AppExercicioSeis {

    public static void main(String[] args) {
        Scanner scanNumeroContatos = new Scanner(System.in);
        Scanner scanNome = new Scanner(System.in);
        Scanner scanEmail = new Scanner(System.in);

        Contato contato;
        Agenda agenda = new Agenda();

        ArrayList<Contato> contatos = new ArrayList<>();

        agenda.setContatos(contatos);

        String nome, email;

        System.out.print("Digite o núemero de contatos para incluir: ");
        int numeroContatos = scanNumeroContatos.nextInt();

        for (int i = 0; i < numeroContatos; i++) {
            System.out.print("Digite o nome do Contato " + (i + 1) + ": ");
            nome = scanNome.next();

            System.out.print("Digite o e-mail do Contato " + (i + 1) + ": ");
            email = scanEmail.next();

            contato = new Contato();

            contato.setNome(nome);
            contato.setEmail(email);

            agenda.adicionarContato(contatos, contato);

        }

        System.out.print("Digite o nome para pesquisa: ");
        nome = scanNome.next();

        Contato contatoBusca = agenda.consultarContato(contatos, nome);
        System.out.println(contatoBusca.getNome() + " - " + contatoBusca.getEmail());

        boolean confereExclusao = agenda.removerContato(contatos, nome);

        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(contatos.get(i).getNome());
            System.out.println(contatos.get(i).getEmail());
        }

    }

}
