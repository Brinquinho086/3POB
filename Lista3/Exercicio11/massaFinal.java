package Exercicio11;

import java.util.Scanner;

public class massaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a massa inicial do material (em gramas): ");
        double massa = sc.nextDouble();

        int tempo = 0;
        int intervaloTempo = 50; 

        while (massa >= 0.5) {
            massa /= 2; 
            tempo += intervaloTempo; 
        }

        System.out.println("Massa final: " + massa + " gramas");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        sc.close();
    }
}
