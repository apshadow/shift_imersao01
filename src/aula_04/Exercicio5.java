package aula_04;

public class Exercicio5 {

	public static void main(String[] args) {

		int i = 49;

		while (i < 100) {
			i++;
			if(i > 50 && i <= 75) {
				continue;
			}
			
			System.out.println(i);

		}

	}

}
