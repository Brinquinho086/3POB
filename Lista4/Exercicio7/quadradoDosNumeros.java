package Exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class quadradoDosNumeros {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> quadrados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Insira o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);

            quadrados.add(numero * numero);
        }

        System.out.println("\nOs quadrados dos números são:");
        for (int quadrado : quadrados) {
            System.out.println(quadrado);
        }

        sc.close();
    }
}
