import java.util.Scanner;

public class cameloDoZe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de games vendidos: ");
        int games = sc.nextInt();
        System.out.print("Insira o preço de cada game vendido: ");
        double gamePreco = sc.nextDouble();

        System.out.print("Insira a quantidade de calculadoras vendida: ");
        int calculadoras = sc.nextInt();
        System.out.print("Insira o preço de cada calculadora vendida: ");
        double calculadoraPreco = sc.nextDouble();

        System.out.print("Insira a quantidade de canetas vendidos: ");
        int canetas = sc.nextInt();
        System.out.print("Insira o preço de cada caneta vendida: ");
        double canetaPreco = sc.nextDouble();

        double faturamentoGames = games*gamePreco;
        double faturamentoCalcu = calculadoras*calculadoraPreco;
        double faturamentoCaneta = canetas*canetaPreco;

        double faturamentoTotal = faturamentoGames + faturamentoCalcu + faturamentoCaneta;

        System.out.print("\nO faturamento dos games foi: " + faturamentoGames);
        System.out.print("\nO faturamento das calculadoras foi: " + faturamentoCalcu);
        System.out.print("\nO faturamento das canetas foi: " + faturamentoCaneta);
        System.out.print("\nO faturamento total foi: " + faturamentoTotal);

    }
}