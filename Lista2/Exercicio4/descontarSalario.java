package Exercicio4;

import java.util.Scanner;

public class descontarSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do funcionario: ");
        String nome = sc.nextLine();

        System.out.print("Insira o sexo do funcionario (H/M): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Salario bruto: ");
        double salarioBruto = sc.nextDouble();
        
        double desconto;

        if (sexo == 'H' || sexo == 'h'){
            desconto = salarioBruto * 0.05; 
        }
        else{
            desconto = salarioBruto * 0.03; 
        }
        
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário líquido: " + salarioLiquido);    
        System.out.println("Valor do desconto: " + desconto);
    }    
}
