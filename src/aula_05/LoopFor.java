package aula_05;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		int qtdeAlunos;
		double notaAluno, mediaAlunos;
		Scanner leitor = new Scanner(System.in);
		System.out.println(
				"Para calcular a média das notas é nescessário " + "primeiramente saber a quantidade de alunos:");
		qtdeAlunos = leitor.nextInt();
		mediaAlunos = 0;

		for (int i = 0; i < qtdeAlunos; i+=1) {
			System.out.println("Digite a nota do " + (i + 1) + "° aluno: ");
			notaAluno = leitor.nextDouble();
			mediaAlunos = mediaAlunos + notaAluno;
		}

		mediaAlunos = mediaAlunos / qtdeAlunos;
		System.out.println("A média de notas dos alunos é de " + mediaAlunos);
		leitor.close();

	}

}
