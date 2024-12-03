package entities;

public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this(nome, null, null);
    }

    public boolean equals(Pessoa outra) {
        if (outra == null){
            return false;
        } else {
            return this.nome.equals(outra.nome) && (this.mae == null && outra.mae == null) || (this.mae != null && this.mae.equals(outra.mae));
        }
    }

    public boolean saoIrmas(Pessoa outra) {
        return ((this.mae != null && this.mae.equals(outra.mae)) || (this.pai != null && this.pai.equals(outra.pai)));
    }

    public boolean Antecessora(Pessoa outra) {
        if (outra == null) {
            return false;
        } else if (this.equals(outra.pai) || this.equals(outra.mae)) {
            return true;
        }
        return (outra.pai != null && this.Antecessora(outra.pai)) || (outra.mae != null && this.Antecessora(outra.mae));
    }

    public String getNome() {
        return nome;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }
}
