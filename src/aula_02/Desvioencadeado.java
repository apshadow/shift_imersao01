package aula_02;

import java.util.Scanner;

public class Desvioencadeado {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int idade;

		System.out.println("Por favor, digite sua idade:");
		idade = leitor.nextInt();

		if (idade <= 0) {
			System.out.println("Valor inválido!");
		}

		else {

			if (idade < 16) {
				System.out.println("Você não pode votar nem embarcar!");
			}

			else {

				if (idade >= 18) {
					System.out.println("Você deve votar e embarcar!");
				}

				else {
					System.out.println("Você pode optar em votar e embarcar!");
				}

			}

		}

		leitor.close();

	}

}
