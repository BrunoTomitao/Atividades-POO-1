package faculdade;

import java.util.Scanner;

public class Docente {

    private String nome;
    private String formacao;
    private String cidade;

    public Docente(String nome, String formacao, String cidade) {
        this.nome = nome;
        this.formacao = formacao;
        this.cidade = cidade;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Formação: " + formacao);
        System.out.println("Cidade: " + cidade);
    }

    public static Docente criarNovoDocenteViaConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do docente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a formação do docente:");
        String formacao = scanner.nextLine();

        System.out.println("Digite a cidade do docente:");
        String cidade = scanner.nextLine();

        return new Docente(nome, formacao, cidade);
    }
}
