import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira a temperatura a ser convertida de FARENHEIT para Celsius: ");
        double temperatura = sc.nextDouble();

        temperatura = (5.0/9.0) * (temperatura-32);

        System.out.print("A temperatura inserida, em celsius, é igual a: " + temperatura);
    }
}