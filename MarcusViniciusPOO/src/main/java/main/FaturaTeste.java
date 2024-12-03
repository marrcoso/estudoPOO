package main;

import entities.FaturaLoja;

import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        String numero;
        String descricao;
        int qtdItem;
        double precoUnidade;
        boolean respostaBooleano = true;
        String resposta;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double total = 0;

        do {
            System.out.println("Numero do produto? ");
            numero = input.nextLine();
            System.out.println("Descrição do produto? ");
            descricao = input.nextLine();
            System.out.println("Preço do produto? ");
            precoUnidade = input2.nextDouble();
            System.out.println("Quantidade de itens? ");
            qtdItem = input2.nextInt();

            FaturaLoja faturas = new FaturaLoja(numero, descricao, qtdItem, precoUnidade);

            total += faturas.getTotalFatura();

            System.out.println("Gostaria de adicionar mais um produto? (S/N)");
            resposta = input.nextLine();
            if (resposta.equalsIgnoreCase("S")){
                respostaBooleano = true;
            } else {
                respostaBooleano = false;
            }
        } while (respostaBooleano);

        System.out.println("Valor total da sua fatura é: " +total);
    }
}
