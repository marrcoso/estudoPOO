/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Transportes.Bicicleta;
import Transportes.Carro;
import Transportes.Moto;

/**
 *
 * @author aluno
 */
public class MeiosDeTransporte {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Toyota", 4, "Corolla", 150);
        Moto moto = new Moto(true, "Yamaha", 2, "Falcon", 300);
        Bicicleta bike = new Bicicleta(21, true, "Caloi", 2, "TSW");
    
        carro.imprimirInformacoes();
        moto.imprimirInformacoes();
        bike.imprimirInformacoes();
        
    }
}
