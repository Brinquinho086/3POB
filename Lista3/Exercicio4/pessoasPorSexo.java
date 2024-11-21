package Exercicio4;

import java.util.Scanner;

public class pessoasPorSexo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 0;
        int totalMasculino = 0;
        int totalFeminino = 0;
        String continuar="";

        do {
            System.out.print("Insira o sexo da pessoa (H/M): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            if (sexo == 'M') {
                totalMasculino++;
            } else if (sexo == 'F') {
                totalFeminino++;
            } else {
                System.out.println("Sexo inválido. Tente novamente.");
                continue; 
            }

            totalPessoas++;

            System.out.print("Deseja cadastrar outra pessoa? (S/N): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Total de pessoas do sexo masculino: " + totalMasculino);
        System.out.println("Total de pessoas do sexo feminino: " + totalFeminino);

        sc.close();
    }
}
