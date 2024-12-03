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
public class Automovel extends Veiculo{
    private double potenciaDoMotor;

    public Automovel(String marca, int qtdRodas, String modelo, double potenciaDoMotor) {
        super(marca, qtdRodas, modelo);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("PotenciaDoMotor: " + potenciaDoMotor);
    }
    
    
}
