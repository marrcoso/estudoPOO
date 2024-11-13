package entities;

import java.time.Year;

public class Visitante {
    private String nome;
    private String cidade;
    private String sexo;
    private int anoNascimento;

    public Visitante(String nome, String cidade, String sexo, int anoNascimento) {
        this.nome = nome;
        this.cidade = cidade;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    public int idade(){
        return Year.now().getValue()-anoNascimento;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade() +
                '}';
    }
}
