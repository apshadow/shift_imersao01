package aula_04;

import java.util.Scanner;

public class ExercícioBonus1 {

	public static void main(String[] args) {

		final String CYAN = "\033[0;36m";
		final String RED = "\033[0;31m";
		final String RESET = "\033[0m";

		Scanner leitor = new Scanner(System.in);
		int numero, i = 1;
		double fatorial = 1;
		System.out.println("Favor inserir o número que gostaria do fatorial:" + RED + "(!)" + RESET);
		numero = leitor.nextInt();

		while (i <= numero) {
			fatorial = fatorial * i;
			i++;
		}
		System.out.println(
				RED + "(" + numero + "!)" + RESET + " tem como valor final: " + CYAN + String.format("%.2f", fatorial));

		leitor.close();

	}

}
