package aula_02;

import java.util.Scanner;

public class Desviosimples {

	public static void main(String[] args) {

		System.out.println("Por favor, digite a sua idade!");

		Scanner leitor = new Scanner(System.in);
		int idade = leitor.nextInt();
		System.out.println("Idade: " + idade);

		if (idade >= 12) {
			System.out.println("Você pode jogar");
		}

		if (idade <= 12) {
			System.out.println("Você não pode jogar");
		}

		leitor.close();

	}

}
