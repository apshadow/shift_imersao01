package aula_04;

import java.util.Scanner;

public class LoopSwitch {

	public static void main(String[] args) {

		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		while (opcao != 4) {
			System.out.println("MENU");
			System.out.println("Opções: \n1)Opção1 \n2)Opção2 \n3)Opção3\n4)Sair");

			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Você Escolheu Opção 1");
				break;
			case 2:
				System.out.println("Você Escolheu Opção 2");
				break;
			case 3:
				System.out.println("Você Escolheu Opção 3");
				break;
			case 4:
				System.out.println("Saindo do Sistema!");
				break;
			default:
				System.out.println("Opção invalidada");

			}

		}
		
		leitor.close();

	}

}
