package aula_04;

import java.util.Scanner;

public class ExercicioBonus2 {

	public static void main(String[] args) {

		final String CYAN = "\033[0;36m";
		final String RED = "\033[0;31m";
		final String RESET = "\033[0m";

		Scanner leitor = new Scanner(System.in);
		int i = 1, tentativas;
		String login, senha;
	

		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		login = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.next();

		if (login.equals("admin") && senha.equals("123")) {
			System.out.println(CYAN + "Você conseguiu logar!");
			System.out.println(RED + "Foi feita apenas uma tentativa.");
		} else {

			while (login != "admin" && senha != "123") {
				System.out.println(RED + "Usuário ou senha inválidos, favor tentar novamente" + RESET);
				System.out.println("Por favor, digite seu username:");
				login = leitor.next();
				System.out.println("Por favor, digite sua senha:");
				senha = leitor.next();
				tentativas = i += 1;

				if (login.equals("admin") && senha.equals("123")) {
					System.out.println(CYAN + "Você conseguiu logar!");
					System.out.println(RED + "Foram feitas " + tentativas + " tentativas.");
					break;
				}

			}

		}

		leitor.close();

	}
}
