package aula_04;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fibonacci = new Fibonacci();
		fibonacci.executarFibonacci();

	}

	public void executarFibonacci() {

		int a = 0, b = 1, aux, n, i = 0;

		System.out.println("Digite um numero: ");
		Scanner scanner = new Scanner(System.in);
		n = Integer.parseInt(scanner.next());
		System.out.println(b);

		while (i < n) {
			aux = a + b;
			a = b;
			b = aux;

			System.out.println(aux);
			i++;
		}
		scanner.close();
	}

}
