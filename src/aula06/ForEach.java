package aula06;

public class ForEach {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
		}

		for (int numero : numeros) {
			System.out.print(numero + "\t");
		}

	}

}
