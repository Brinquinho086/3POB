package Exercicio2;

public class somaDe1a50 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 50; i++) {
            soma += i;
        }

        System.out.println("O somatório dos números de 1 até 50 é: " + soma);
    }
}
