package model;

import Projeto_AV2.model.Funcionario;
import java.io.*;
import java.util.ArrayList;

public class FuncionarioRepository {
    
    private final String arquivoFuncionarios = "funcionarios.txt";

    public void salvarFuncionarios(ArrayList<Funcionario> funcionarios) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoFuncionarios))) {
            for (Funcionario funcionario : funcionarios) {
                writer.write(funcionario.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os funcionarios: " + e.getMessage());
        }
    }

    public ArrayList<Funcionario> carregarFuncionarios() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoFuncionarios))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                funcionarios.add(Funcionario.fromFileString(linha));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de funcionarios não encontrado. Será criado ao salvar novos funcionarios.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar os funcionarios: " + e.getMessage());
        }
        return funcionarios;
    }
}
