/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

/**
 *
 * @author aluno
 */
public class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade = 0;

    public Veiculo(String marca, int qtdRodas, String modelo) {
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void acelerar(int valor){
        this.velocidade += valor;
    }
    
    public void frear(int valor){
        this.velocidade -= valor;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }
    
    public void imprimirInformacoes() {
        System.out.println("Marca: " +marca+ 
                "\nQuantidade de Rodas: " +qtdRodas+
                "\nModelo: " +modelo+
                "\nVelocidade: " +velocidade+ " km/h");
    }
    
}
