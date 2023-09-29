package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Cadastro de Docentes");

        List<Docente> docentes = new ArrayList<>();

        // Cadastre os primeiros 4 docentes
        for (int i = 0; i < 4; i++) {
            Docente novoDocente = Docente.criarNovoDocenteViaConsole();
            docentes.add(novoDocente);
        }

        // Imprima os dados de todos os docentes
        for (Docente docente : docentes) {
            docente.imprimirDados();
        }

        // Permita cadastrar mais docentes conforme a demanda
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Deseja cadastrar mais um docente? (s/n)");
            String resposta = scanner.nextLine().toLowerCase();
            if (resposta.equals("s")) {
                Docente novoDocente = Docente.criarNovoDocenteViaConsole();
                docentes.add(novoDocente);
                novoDocente.imprimirDados();
            } else if (resposta.equals("n")) {
                break;
            }
        }
    }
}
