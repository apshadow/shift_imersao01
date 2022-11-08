package aula_01;

import java.util.Scanner;

public class ONGkm {

	public static void main(String[] args) {

		final String CYAN = "\033[0;36m";

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digita sua Kilometragem Inicial: ");
		float valor1 = leitor.nextFloat();

		System.out.println("Digita sua Kilometragem Final: ");
		float valor2 = leitor.nextFloat();

		System.out.println("Quantos Litros foram Abastecidos: ");
		float valor3 = leitor.nextFloat();

		valor1 = (valor2 - valor1) / valor3;

		System.out.println("Kilometragem por Litro: " + "\n" + CYAN + valor1 + " Km/l");

		leitor.close();

	}

}
