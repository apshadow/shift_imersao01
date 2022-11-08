package aula_01;

import java.util.Scanner;

public class Saudao {

	public static void main(String[] args) {
		
		System.out.println("Por Favor Insira seu nome");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.next();
		System.out.println("Bem Vindo " + nome);
		leitor.close();

	}

}
