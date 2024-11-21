package Exercicio7;

import java.util.Scanner;

public class maiorNumero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE; 
        String continuar;

        do {
            System.out.print("Insira um número inteiro: ");
            int numero = sc.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            System.out.print("Deseja digitar outro número? (S/N): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("O maior número digitado foi: " + maiorNumero);

        sc.close();
    }
}
