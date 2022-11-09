package aula_02;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double ouro, prata, bronze;

		System.out.println("Por favor, digite o peso de ouro em gramas:");
		ouro = leitor.nextDouble();

		System.out.println("Por favor, digite o peso de prata em gramas:");
		prata = leitor.nextDouble();

		System.out.println("Por favor, digite o peso de bronze em gramas:");
		bronze = leitor.nextDouble();

		leitor.close();

		if (ouro == prata && prata == bronze) {
			System.out.println("ouro, prata e bronze possuem o mesmo peso de " + ouro + " gramas");
		}

		else {

			if (ouro > prata && ouro > bronze) {
				System.out.println("o maior peso é em ouro, pesando " + ouro + " gramas");
			}

			else {

				if (prata > ouro && prata > bronze) {
					System.out.println("o maior peso é em prata, pesando " + prata + " gramas");
				}

				else {

					if (bronze > ouro && bronze > prata) {
						System.out.println("o maior peso é em bronze, pesando " + bronze + " gramas");
					}

					else {

						if (ouro == bronze) {
							System.out.println("ouro e bronze tem o maior peso, ambas possuem " + ouro + " gramas");
						}

						if (prata == bronze) {
							System.out.println("prata e bronze tem o maior peso, ambas possuem " + prata + " gramas");
						}

						if (ouro == prata) {
							System.out.println("ouro e prata tem o maior peso, ambas possuem " + ouro + " gramas");
						}

					}
				}
			}

		}

	}

}
