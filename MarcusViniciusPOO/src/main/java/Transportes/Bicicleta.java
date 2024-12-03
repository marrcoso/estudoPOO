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
public class Bicicleta extends Veiculo{
    private int numMarchas;
    private boolean bagageiro;

    public Bicicleta(int numMarchas, boolean bagageiro, String marca, int qtdRodas, String modelo) {
        super(marca, qtdRodas, modelo);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }
    
    public void imprimirInformacoes() {
        System.out.println("Bicicleta");
        super.imprimirInformacoes();
        System.out.println("Número de marchas: " +numMarchas+
                "\nBagageiro: " +bagageiro);
    }
}
