package main;

import entities.Pessoa;

public class ArvoreGenealogica {
    public static void main(String[] args) {
        Pessoa mae = new Pessoa("Maria");
        Pessoa pai = new Pessoa("João");
        Pessoa filho = new Pessoa("Carlos", pai, mae);
        Pessoa filha = new Pessoa("Ana", pai, mae);

        System.out.println("Carlos e Ana são irmãos? " + filho.saoIrmas(filha));
        System.out.println("Maria é antecessora de Carlos? " + mae.Antecessora(filho));
        System.out.println("Carlos e João são iguais? " + filho.equals(pai));
    }
}
