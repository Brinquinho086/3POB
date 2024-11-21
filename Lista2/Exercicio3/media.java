package Exercicio3;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Insira nota da AV1: ");
        double av1 = sc.nextDouble();
        System.out.print("Insira nota da AV2: ");
        double av2 = sc.nextDouble();

        double media = (av1+av2)/2;
        
        if (media < 7){
            System.out.println(nome + ", está reprovado.");
        }
        else{
            System.out.println(nome + ", está aprovado.");
        }
    }    
}



