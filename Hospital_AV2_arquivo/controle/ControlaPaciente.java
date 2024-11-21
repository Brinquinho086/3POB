package controle;

import dominio.Paciente;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlaPaciente {
    private ArrayList<Paciente> pacientes;
    private final String arquivoPacientes = "pacientes.txt";

    public ControlaPaciente() {
        this.pacientes = new ArrayList<>();
        carregarPacientes();
    }

    public void adicionarPaciente(int numero, double altura, double peso) {
        Paciente paciente = new Paciente(numero, altura, peso);
        pacientes.add(paciente);
        salvarPacientes();
        System.out.println("Paciente adicionado ao sistema.");
    }

    public void listarPaciente() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente registrado.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Paciente paciente : pacientes) {
                paciente.listarPaciente();
            }
        }
    }

    public void atualizarPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nova altura do paciente: ");
            double novaAltura = scanner.nextDouble();
            System.out.print("Novo peso do paciente: ");
            double novoPeso = scanner.nextDouble();
            
            paciente.setAltura(novaAltura);
            paciente.setPeso(novoPeso);
            salvarPacientes();
            System.out.println("Paciente atualizado com sucesso.");
        } else {
            System.out.println("Paciente de número " + numero + " não encontrado.");
        }
    }

    public void consultarPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            
            double altura = paciente.getAltura();
            double peso = paciente.getPeso();
            
            System.out.println("\nDados do paciente de número: " + numero);
            System.out.print("Altura do paciente: " + altura);
            System.out.print("\nPeso do paciente: " + altura);
        } else {
            System.out.println("Paciente de número " + numero + " não encontrado.");
        }
    }

    public void excluirPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            pacientes.remove(paciente);
            salvarPacientes();
            System.out.println("Paciente removido com sucesso.");
        } else {
            System.out.println("Paciente de número " + numero + " não encontrado.");
        }
    }

    private Paciente buscarPacientePorNumero(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                return paciente;
            }
        }
        return null;
    }

    private void salvarPacientes() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoPacientes))) {
            for (Paciente paciente : pacientes) {
                writer.write(paciente.getNumero() + ";" + paciente.getAltura() + ";" + paciente.getPeso());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os pacientes no arquivo: " + e.getMessage());
        }
    }

    private void carregarPacientes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoPacientes))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int numero = Integer.parseInt(dados[0]);
                double altura = Double.parseDouble(dados[1]);
                double peso = Double.parseDouble(dados[2]);
                pacientes.add(new Paciente(numero, altura, peso));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de pacientes não encontrado. Será criado ao salvar novos pacientes.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar os pacientes: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ControlaPaciente controle = new ControlaPaciente();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Paciente");
            System.out.println("3. Atualizar Paciente");
            System.out.println("4. Excluir Paciente");
            System.out.println("5. Consultar Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número do paciente: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Altura do paciente: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Peso do paciente: ");
                    double peso = scanner.nextDouble();
                    controle.adicionarPaciente(numero, altura, peso);
                    break;
                case 2:
                    controle.listarPaciente();
                    break;
                case 3:
                    System.out.print("Insira o numero do paciente: ");
                    int numeroAtualizar = scanner.nextInt();
                    scanner.nextLine(); 
                    controle.atualizarPaciente (numeroAtualizar);
                    break;
                case 4:
                    System.out.print("Número do paciente a ser removido: ");
                    int numeroExcluir = scanner.nextInt();
                    controle.excluirPaciente(numeroExcluir);
                    break;
                case 5:
                    System.out.print("Número do paciente a ser consultado: ");
                    int numeroConsultar = scanner.nextInt();
                    controle.consultarPaciente(numeroConsultar);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}