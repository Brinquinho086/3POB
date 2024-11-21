package Exercicio6;

import java.util.Scanner;

public class calcularSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Insira o nome do empregado: ");
        String nome = sc.nextLine();
        System.out.print("Insira o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        double desconto;
        if (salarioBruto < salarioMinimo) {
            desconto = salarioBruto * 0.02;
        } else if (salarioBruto == salarioMinimo) {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.08;
        }

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}
