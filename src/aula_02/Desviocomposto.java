package aula_02;

import java.util.Scanner;

public class Desviocomposto {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double doacao, investimento, usoimediato;

		System.out.println("Por favor, digite o valor da doação recebida:");
		doacao = leitor.nextDouble();
		
		if (doacao <= 0) {
			System.out.println("Valor Invalido!");
		}

		if (doacao < 1000.00) {
			investimento = doacao * 0.05;
		}

		else {
			investimento = doacao * 0.15;
		}

		usoimediato = doacao - investimento;

		if (doacao >= 1) {
		System.out.println("A doação de R$" + doacao + " implica em um investimento de R$" + investimento
				+ ", restando R$" + usoimediato + " para uso imediato.");
     	}
		
		
		leitor.close();

	}

}
