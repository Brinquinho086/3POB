package view;

import Projeto_AV2.controller.FuncionarioController;
import Projeto_AV2.model.Funcionario;
import model.Desenvolve;
import model.Desenvolvedor;
import model.Gerencia;
import model.Gerente;
import model.GerenteDesenvolvedor;
import model.Treina;
import model.Treinador;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionarioView {
    private FuncionarioController controller;
    private Scanner scanner;

    public FuncionarioView(FuncionarioController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Funcionario");
            System.out.println("2. Listar Funcionarios");
            System.out.println("3. Alterar Funcionario");
            System.out.println("4. Excluir Funcionario");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = capturarInteiro();

            switch (opcao) {
                case 1 -> adicionarFuncionario();
                case 2 -> listarProdutos();
                case 3 -> alterarProduto();
                case 4 -> excluirProduto();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarFuncionario() {
        
        do { 
            System.out.println("\nMenu de Funcionario:");
            System.out.println("1. Adicionar Desenvolvedor");
            System.out.println("2. Adicionar Gerente");
            System.out.println("3. Adicionar Treinador");
            System.out.println("4. Adicionar Funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = capturarInteiro();

            switch (opcao) {
                case 1 -> adicionarDesenvolvedor();
                case 2 -> adicionarGerente();
                case 3 -> adicionarTreinador();
                case 4 -> adicionarGerenteDesenvolvedor();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }     
        } while (opcao != 0);

    }

    private static void adicionarDesenvolvedor(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Desenvolvedor: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Desenvolvedor: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 

        funcionarios.add(new Desenvolvedor(nome, salario));
        System.out.println("Desenvolvedor adicionado com sucesso!");
    }

    private static void adicionarGerente(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Gerente: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Gerente: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 

        funcionarios.add(new Gerente(nome, salario));
        System.out.println("Gerente adicionado com sucesso!");
    }

    private static void adicionarTreinador(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do Treinador: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do Treinador: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 

        funcionarios.add(new Treinador(nome, salario));
        System.out.println("Treinador adicionado com sucesso!");
    }

    private static void adicionarGerenteDesenvolvedor(ArrayList<Funcionario> funcionarios, Scanner scanner) {
        System.out.print("Nome do GerenteDesenvolvedor: ");
        String nome = scanner.nextLine();
        System.out.print("Salário do GerenteDesenvolvedor: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); 

        funcionarios.add(new GerenteDesenvolvedor(nome, salario));
        System.out.println("GerenteDesenvolvedor adicionado com sucesso!");
    }

   private static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDetalhes();

            if (funcionario instanceof Desenvolve desenvolvedor) {
                desenvolvedor.codar();
                desenvolvedor.resolverProblemas();
            }

            if (funcionario instanceof Gerencia gerente) {
                gerente.organizarEquipe();
                gerente.conduzirReunioes();
            }

            if (funcionario instanceof Treina treinador) {
                treinador.ensinarTecnologia();
                treinador.motivarEquipe();
            }

            System.out.println();
        }
    }

    private void alterarFuncionario() {
        String novoNome = capturarString("Novo Nome: ");
        double novoSalario = capturarDouble("Novo Salario: ");

        if (controller.alterarFuncionario(novoNome, novoSalario)) {
            System.out.println("Funcionario alterado com sucesso!");
        } else {
            System.out.println("Funcionario de nome " + novoNome + " não encontrado.");
        }
    }

    private void excluirFuncionario() {
        String nome = capturarString();
        if (controller.excluirFuncionario(nome)) {
            System.out.println("Funcionario excluído com sucesso!");
        } else {
            System.out.println("Funcionario de nome " + nome + " não encontrado.");
        }
    }

    private int capturarInteiro() {
        return capturarInteiro(null);
    }

    private int capturarInteiro(String mensagem) {
        int valor = 0;
        boolean valido;
        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem);
                }
                valor = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                valido = false;
                scanner.nextLine(); 
            }
        } while (!valido);
        scanner.nextLine(); 
        return valor;
    }

    private double capturarDouble(String mensagem) {
        double valor = 0.0;
        boolean valido;
        do {
            try {
                System.out.print(mensagem);
                valor = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                valido = false;
                scanner.nextLine(); 
            }
        } while (!valido);
        scanner.nextLine(); 
        return valor;
    }

    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }  
}
