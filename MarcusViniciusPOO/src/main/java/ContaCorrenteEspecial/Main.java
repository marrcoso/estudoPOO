package ContaCorrenteEspecial;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Repositorio repositorio = new Repositorio();
		Scanner input = new Scanner(System.in);
		String escolha;
		boolean sair = false;
		int i = 0;
		
		String numero;
		String titular;
		double saldo;
		double limiteConta;
		
		ContaCorrente[] contas = new ContaCorrente[2];
		
		System.out.println("MENU");
		System.out.println("1 - Cadastrar Nova Conta"
				+ "\n2 - Saque"
				+ "\n3 - Depósito"
				+ "\n4 - Listar Contas"
				+ "\n5 - Relatório Geral"
				+ "\n6 - Relatório das Contas Abaixo de 0"
				+ "\n7 - Relatório da Conta de Um Cliente"
				+ "\n9 - Sair");
		
		do {
			escolha = input.nextLine();
			if  (escolha.equalsIgnoreCase("1")) {
				contas[i] = new ContaCorrente();
				System.out.println("Número de registro? ");
				numero = input.nextLine();
				System.out.println("Nome do proprietário? ");
				titular = input.nextLine();
				i++;
				
			}
			else if (escolha.equalsIgnoreCase("9")) {
				sair = true;
			}
		} while (sair);
	}
}
