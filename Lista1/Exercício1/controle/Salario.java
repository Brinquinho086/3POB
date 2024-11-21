package controle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Insira a mátricula do primeiro empregado: ");
        int matricula1 = sc.nextInt();
        System.out.print("Insira o salário do primeiro empregado: ");
        double salario1 = sc.nextDouble();

        System.out.print("Agora insira a mátricula do segundo empregado: ");
        int matricula2 = sc.nextInt();
        System.out.print("Agora insira o salário do segundo empregado: ");
        double salario2 = sc.nextDouble();

        double  desconto = salario1 * 0.05;
        double  acrescimo = salario2 * 0.09;

        salario1 = salario1 - desconto;
        salario2 = salario2 + acrescimo;

        System.out.print("O salario do primeiro foi reduzido em " + desconto + " e agora o salário atual é de " + salario1);
        System.out.print("O salario do segundo teve um acréscimo de " + acrescimo + " e agora o salário atual é de " + salario2);

    }
}