package dominio;

public class Paciente {
    private int numero;
    private double altura;
    private double peso;

    public Paciente (int numero, double altura, double peso) {
        this.numero = numero;
        this.altura = altura;
        this.peso = peso;
    }

    public int getNumero() {
        return numero;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void listarPaciente() {
        System.out.println("\nInformações do paciente: ");
        System.out.println("Número: " + numero);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

    }
}