package Exercicio1;

import java.util.Scanner;

public class deMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Agora insira sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18){
            System.out.println(nome + " é de menor.");
        }
    }
}