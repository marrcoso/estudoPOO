package main;

import entities.Funcionario;

import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        String sexo;
        String cargo;
        float salarioBase;
        int horasExtras;
        int numeroFilhos;
        Funcionario[] funcionario = new Funcionario[1];
        int qtdM = 0, qtdF = 0;
        double maiorFilhos = 0, maiorHoras = 0, maiorSalario = 0;
        int indiceMaiorFilhos = 0, indiceHorasExtras = 0, indiceSalario = 0;

        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Digite o nome: ");
            nome = input.nextLine();
            System.out.println("Digite o sexo(M/F): ");
            sexo = input.nextLine();
            if (sexo.equalsIgnoreCase("M")){
                qtdM++;
            }
            if (sexo.equalsIgnoreCase("F")){
                qtdF++;
            }
            System.out.println("Digite o cargo: ");
            cargo = input.nextLine();
            System.out.println("Digite o salário base: ");
            salarioBase = input.nextInt();
            System.out.println("Digite as horas extras: ");
            horasExtras = input.nextInt();
            System.out.println("Digite o número de filhos: ");
            numeroFilhos = input.nextInt();

            funcionario[i] = new Funcionario(nome, sexo, cargo, salarioBase, horasExtras, numeroFilhos);

            if (funcionario[i].getNumeroFilhos() > maiorFilhos){
                maiorFilhos = funcionario[i].getNumeroFilhos();
                indiceMaiorFilhos = i;
            }

            if (funcionario[i].getHorasExtras() > maiorHoras){
                maiorHoras = funcionario[i].getHorasExtras();
                indiceHorasExtras = i;
            }

            if (funcionario[i].calcularSalario() > maiorSalario){
                maiorSalario = funcionario[i].calcularSalario();
                indiceSalario = i;
            }

            System.out.println(funcionario[i].toString());
        }

        System.out.println("Quantidade de homens: " +qtdM+ "\nQuantidade de mulheres: " +qtdF);
        System.out.println("Funcionário com mais filhos: " +funcionario[indiceMaiorFilhos].getNome()+ " com " +funcionario[indiceMaiorFilhos].getNumeroFilhos()+ " filhos.");
        System.out.println("Funcionário com mais horas extras: " +funcionario[indiceHorasExtras].getNome()+ " com " +funcionario[indiceHorasExtras].getHorasExtras()+ " horas extras.");
        System.out.println("Funcionário com o maior salário: " +funcionario[indiceSalario].getNome()+ " com " +String.format("%.2f", funcionario[indiceSalario].calcularSalario())+ " reais.");
    }
}
