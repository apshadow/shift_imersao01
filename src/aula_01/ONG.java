package aula_01;

import java.util.Scanner;

public class ONG {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor em dolar: ");
		float valor1 = leitor.nextFloat();

		leitor.close();

		valor1 = valor1 * 5.12f;

		System.out.println("Conversão para Real: " + valor1);

	}

}
