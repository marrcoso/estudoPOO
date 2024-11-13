package main;

import entities.Visitante;

import java.util.Scanner;

public class Visitantes {
    public static void main(String[] args) {
        String nome;
        String cidade;
        String sexo;
        int anoNascimento;
        Visitante[] visitantes = new Visitante[15];
        Scanner input = new Scanner(System.in);
        int qtdVisitantes = 0, qtdMasc = 0, qtdFem = 0, qtdMenorIdade = 0;

        for (int i = 0; i < visitantes.length; i++) {
            System.out.println("----- Tela de Visitante -----");
            System.out.println("Nome: ");
            nome = input.nextLine();
            System.out.println("Cidade: ");
            cidade = input.nextLine();
            System.out.println("Sexo (F ou M): ");
            sexo = input.nextLine();
            if (sexo.equalsIgnoreCase("M")){
                qtdMasc++;
            }
            if (sexo.equalsIgnoreCase("F")){
                qtdFem++;
            } else {
                System.out.println("Sexo inválido!");
            }
            System.out.println("Ano de Nascimento: ");
            anoNascimento = input.nextInt();

            if (visitantes[i].idade() > 18){
                qtdMenorIdade++;
            }

            visitantes[i] = new Visitante(nome, cidade, sexo, anoNascimento);

            qtdVisitantes++;

            System.out.println(visitantes[i].toString());
        }
        System.out.println("Número total de visitantes: " +qtdVisitantes+
                "\nNúmero total de homens: " +qtdMasc+
                "\nNúmero total de mulheres: " +qtdFem+
                "\nNúmero total de visitantes menores de 18 anos: " +qtdMenorIdade+
                "\nNúmero total de cidades dos Visitantes: ");

    }
}
