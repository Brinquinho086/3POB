import java.util.Scanner;

public class futebol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o nome da equipe de futebol: ");
        String equipe = sc.nextLine();

        System.out.print("Insira a quantidade de derrotas da equipe: ");
        int derrotas = sc.nextInt();

        System.out.print("Insira a quantidade de empates da equipe: ");
        int empates = sc.nextInt();

        System.out.print("Insira a quantidade de vitórias da equipe: ");
        int vitorias = sc.nextInt();

        int pontosGanhos = (vitorias * 3) + empates;
        int pontosPerdidos = derrotas * 3;

        System.out.println("\nA equipe: " + equipe);
        System.out.println("\nGanhou: " + pontosGanhos + " pontos.");
        System.out.println("\nMas perdeu: " + pontosPerdidos + " pontos.");
    }
}