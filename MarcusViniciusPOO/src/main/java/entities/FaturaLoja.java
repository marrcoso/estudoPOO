package entities;

public class FaturaLoja {
    private String numero;
    private String descricao;
    private int qtdItem;
    private double precoUnidade;

    public FaturaLoja(String numero, String descricao, int qtdItem, double precoUnidade) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtdItem = qtdItem;
        this.precoUnidade = precoUnidade;
    }

    public double getTotalFatura() {
        if (this.precoUnidade < 0.0) {
            return 0.0;
        } else {
            return precoUnidade*qtdItem;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }
}
