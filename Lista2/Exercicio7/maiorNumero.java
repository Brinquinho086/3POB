package Exercicio7;

import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numero2 = sc.nextInt();
        System.out.print("Insira o terceiro número: ");
        int numero3 = sc.nextInt();

        int maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
