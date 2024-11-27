package controller;

import Projeto_AV2.model.Funcionario;
import model.FuncionarioRepository;

import java.*;
import java.util.ArrayList;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios;
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController() {
        this.funcionarioRepository = new FuncionarioRepository();
        this.funcionarios = funcionarioRepository.carregarFuncionarios();
    }

    public ArrayList<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionarios); 
    }

    public void adicionarFuncionario (String nome, double salario) {
        Funcionario funcionario = new Funcionario(nome, salario);
        funcionarios.add(funcionario);
        funcionarioRepository.salvarFuncionarios(funcionarios);
    }

    public boolean alterarFuncionario(String nome, String novoNome, double novoSalario) {
        Funcionario funcionario = buscarFuncionarioPorNome(nome);
        if (funcionario != null) {
            funcionario.setNome(novoNome);
            funcionario.setSalario(novoSalario);
            funcionarioRepository.salvarFuncionarios(funcionarios);
            return true;
        }
        return false;
    }

    public boolean excluirFuncionario(String nome) {
        Funcionario funcionario = buscarFuncionarioPorNome(nome);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            funcionarioRepository.salvarFuncionarios(funcionarios);
            return true;
        }
        return false;
    }

    private Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome() == nome) {
                return funcionario;
            }
        }
        return null;
    }
}
