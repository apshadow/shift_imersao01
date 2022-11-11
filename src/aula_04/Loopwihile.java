package aula_04;

import java.util.Scanner;

public class Loopwihile {

	public static void main(String[] args) {

		double somaAlturas = 0.0, media;
		int i = 0, quantidadeAlunos;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de Alunos:");
		quantidadeAlunos = leitor.nextInt();

		while (i < quantidadeAlunos) {
			System.out.println("Digite a altura do aluno em centímetros:");
			somaAlturas = somaAlturas + leitor.nextDouble();
			i += 1;

		}

		media = somaAlturas / 6.0;
		System.out.println("A media de altura dos alunos é: " + String.format("%.2f", media) + "centímetros");

		leitor.close();

	}

}
