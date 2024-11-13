package entities;

public class Funcionario {
    private String nome;
    private String sexo;
    private String cargo;
    private float salarioBase;
    private int horasExtras;
    private int numeroFilhos;

    public Funcionario(String nome, String sexo, String cargo, float salarioBase, int horasExtras, int numeroFilhos) {
        this.nome = nome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.numeroFilhos = numeroFilhos;
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public int getNumeroFilhos() {
        return numeroFilhos;
    }

    public double calcularSalario(){
        double calculoHoras = (salarioBase/220)*1.20;
        double calculoFilhos = 18.5*this.numeroFilhos;
        return salarioBase+calculoFilhos+(calculoHoras*this.horasExtras);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salarioBase=" + salarioBase +
                ", horasExtras=" + horasExtras +
                ", numeroFilhos=" + numeroFilhos +
                '}';
    }
}
