package Exercicio10;

import java.util.Scanner;

public class leitorNumeros {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumeros = 0;
        int totalPares = 0;
        int totalImpares = 0;
        String continuar="";

        do {
            System.out.print("Insira um número inteiro: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }

            totalNumeros++;

            System.out.print("Deseja digitar outro número? (S/N): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("Quantidade total de números digitados: " + totalNumeros);
        System.out.println("Quantidade de números pares: " + totalPares);
        System.out.println("Quantidade de números ímpares: " + totalImpares);

        sc.close();
    }
}
