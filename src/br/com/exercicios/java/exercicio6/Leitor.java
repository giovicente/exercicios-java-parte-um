package br.com.exercicios.java.exercicio6;

import java.util.Scanner;

public class Leitor {

    private Scanner scanNome, scanEmail, scanOpcaoMenu;
    private Escritor escritor;

    public Leitor() { }

    public Scanner getScanNome() { return scanNome; }

    public void setScanNome(Scanner scanNome) { this.scanNome = scanNome; }

    public Scanner getScanEmail() { return scanEmail; }

    public void setScanEmail(Scanner scanEmail) { this.scanEmail = scanEmail; }

    public int inserirOpcaoMenu() {
        scanOpcaoMenu = new Scanner(System.in);
        int opcao = scanOpcaoMenu.nextInt();

        return opcao;
    }

    public String inserirNomeContato() {
        scanNome = new Scanner(System.in);
        escritor = new Escritor();

        escritor.escreverSolicitacaoNome();
        String nome = scanNome.next();

        return nome;
    }

    public String inserirEmailContato() {
        scanEmail = new Scanner(System.in);
        escritor = new Escritor();

        escritor.escreverSolicitacaoEmail();
        String email = scanEmail.next();

        return email;
    }
}
