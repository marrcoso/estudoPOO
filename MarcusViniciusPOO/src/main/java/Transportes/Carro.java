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
public class Carro extends Automovel{
    private int qtdPortas;

    public Carro(int qtdPortas, String marca, int qtdRodas, String modelo, double potenciaDoMotor) {
        super(marca, qtdRodas, modelo, potenciaDoMotor);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void imprimirInformacoes() {
        System.out.println("Carro");
        super.imprimirInformacoes();
        System.out.println("Quantidade de Portas: " +qtdPortas);
    }
    
    
}
