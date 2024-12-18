package Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class listaTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Insira o código da pessoa " + i + ": ");
            int codigo = sc.nextInt();
            codigos.add(codigo);

            System.out.print("Insira o nome da pessoa " + i + ": ");
            String nome = sc.next();
            nomes.add(nome);

            System.out.print("Insira o telefone da pessoa " + i + ": ");
            String telefone = sc.next();
            telefones.add(telefone);
        }

        String continuar;
        do {
            System.out.print("Insira o código da pessoa que deseja consultar: ");
            int codigoConsulta = sc.nextInt();

            if (codigos.contains(codigoConsulta)) {
                int index = codigos.indexOf(codigoConsulta);
                System.out.println("Código: " + codigos.get(index));
                System.out.println("Nome: " + nomes.get(index));
                System.out.println("Telefone: " + telefones.get(index));
            } else {
                System.out.println("Código não encontrado.");
            }

            System.out.print("Deseja consultar outra pessoa? (S/N): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        sc.close();
    }
}
