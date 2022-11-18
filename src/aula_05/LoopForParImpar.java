package aula_05;

import java.util.Scanner;

public class LoopForParImpar {

//	Tente implementar uma pequena mudança no seu programa: faça ele calcular separadamente as médias aritméticas dos alunos pares da turma e dos alunos ímpares.

	public static void main(String[] args) {
		int qtdeAlunos, qtdePares = 0, qtdeImpares = 0;
		double notaAluno, mediaAlunosPares = 0, mediaAlunosImpares = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Para calcular a média das notas é nescessário primeiramente saber a quantidade de alunos:");
		qtdeAlunos = leitor.nextInt();

		for (int i = 0; i < qtdeAlunos; i += 1) {
			System.out.println("Digite a nota do " + (i + 1) + "° aluno: ");
			notaAluno = leitor.nextDouble();
			if ((i + 1) % 2 == 0) {
				mediaAlunosPares = mediaAlunosPares + notaAluno;
				qtdePares += 1;
			} else {
				mediaAlunosImpares = mediaAlunosImpares + notaAluno;
				qtdeImpares += 1;
			}
		}

		mediaAlunosPares = mediaAlunosPares / qtdeImpares;
		mediaAlunosImpares = mediaAlunosImpares / qtdePares;
		System.out.println("A média de notas dos alunos pares é de " + mediaAlunosPares);
		System.out.println("A média de notas dos alunos impares é de " + mediaAlunosImpares);
		leitor.close();

	}

}
