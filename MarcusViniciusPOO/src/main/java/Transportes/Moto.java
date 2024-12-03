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
public class Moto extends Automovel{
    private boolean partidaEletrica;

    public Moto(boolean partidaEletrica, String marca, int qtdRodas, String modelo, int potenciaDoMotor) {
        super(marca, qtdRodas, modelo, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public void imprimirInformacoes() {
        System.out.println("Moto");
        super.imprimirInformacoes();
        System.out.println("PartidaEletrica: " + partidaEletrica);
    }
}
