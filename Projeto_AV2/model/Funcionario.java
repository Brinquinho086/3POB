package model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
    
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do funcionário não pode ser vazio ou nulo.");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("O valor do salario não pode ser negativo.");
        }
        
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }

    public void receberAumento(double aumento){
        salario = salario + ((aumento/100) * salario);
    }
    
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do funcionario não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("O valor do salario deve ser positivo.");
        }
        this.salario = salario;
    }

    public abstract void mostrarDetalhes();

    

}
