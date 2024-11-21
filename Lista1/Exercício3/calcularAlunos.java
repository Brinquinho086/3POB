import java.util.Scanner;

public class calcularAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o código dos alunos: ");
        int codigo = sc.nextInt();

        System.out.print("Insira a quantidade de alunos do sexo masculino: ");
        int masculino = sc.nextInt();

        System.out.print("Insira a quantidade de alunos do sexo feminino: ");
        int feminino = sc.nextInt();

        System.out.print("Insira a quantidade de alunos aprovados: ");
        int aprovados = sc.nextInt();

        int totalAlunos = masculino + feminino;

        double masculinoPorcento = (masculino*100)/totalAlunos;
        double femininoPorcento = (feminino*100)/totalAlunos;
        double reprovadosPorcento = (aprovados*100)/totalAlunos;

        System.out.print("\nA porcentagem de alunos do sexo masculino na turma é igual a " + masculinoPorcento + "%.");
        System.out.print("\nA porcentagem de alunos do sexo feminino na turma é igual a " + femininoPorcento + "%.");
        System.out.print("\nA porcentagem de alunos reprovados na turma é igual a " + reprovadosPorcento + "%.");
        System.out.print("\nO total de alunos na turma é igual a " + totalAlunos);

    }
}