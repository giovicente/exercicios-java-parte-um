package br.com.exercicios.java.exercicio6;

public class MenuPrincipal {

    public void montarMenuPrincipal() {
        Escritor escritor = new Escritor();

        Leitor leitor = new Leitor();
        int opcao;

        Agenda agenda = new Agenda();
        String nome, email;

        while (true) {
            escritor.escreverMenuPrincipal();
            opcao = leitor.inserirOpcaoMenu();
            switch (opcao) {
                case 1:
                    nome = leitor.inserirNomeContato();
                    email = leitor.inserirEmailContato();

                    Contato contato = new Contato(nome, email);
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    nome = leitor.inserirNomeContato();
                    Contato contatoPesquisado = agenda.consultarContato(nome);
                    if (contatoPesquisado != null) escritor.escreverRetornoPesquisaContato(contatoPesquisado);
                    break;
                case 3:
                    nome = leitor.inserirNomeContato();
                    agenda.removerContato(nome);
                    break;
                case 4:
                    System.exit(0);
                default:
                    escritor.escreverMensagemOpcaoInvalida();
                    break;
            }
        }
    }
}
