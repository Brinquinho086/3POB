package Exercicio2;

import java.util.Scanner;

public class calcularIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o ano atual: ");
        int ano = sc.nextInt();

        System.out.print("Agora seu ano de nascimento: ");
        int nascimento = sc.nextInt();
        
        int idade = ano-nascimento;
        
        if (idade < 16){
            System.out.println("Você tem " + idade + " anos, logo não pode votar.");
        }
        else{
            System.out.println("Você tem " + idade + " anos, logo é eleitor.");
        }
    }
}
