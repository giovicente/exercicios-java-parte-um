package br.com.exercicios.java.exercicio6;

public class Escritor {

    public Escritor() { }

    public void escreverMenuPrincipal() {
        System.out.println("*** Menu Principal ***");
        System.out.println("Selecione a opção Desejada: ");
        System.out.println("Opção 1 - Adicionar Contato");
        System.out.println("Opção 2 - Consultar Contato pelo nome");
        System.out.println("Opção 3 - Excluir Contato pelo nome");
        System.out.println("Opção 4 - Sair");
    }

    public void escreverSolicitacaoNome() { System.out.println("Digite o nome do contato: "); }

    public void escreverSolicitacaoEmail() { System.out.println("Digite o e-mail do contato: "); }

    public void escreverRetornoInclusaoContato(Contato contato) {
        System.out.println("Contato adicionado com sucesso: " + contato.getNome() + " - " + contato.getEmail());
    }

    public void escreverRetornoPesquisaContato(Contato contato) {
        System.out.println("Nome: " + contato.getNome() + " - " + "E-mail: " + contato.getEmail());
    }

    public void escreverContatoNaoEncontrado() { System.out.println("Contato não encontrado."); }

    public void escreverContatoRemovidoComSucesso() { System.out.println("Contato removido com sucesso."); }

    public void escreverMensagemOpcaoInvalida() {
        System.out.println("Opção inválida! Por favor, digite uma opção entre 1 e 4.");
    }
}
