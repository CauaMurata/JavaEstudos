package outrosTopicos;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 3 números: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int maior = max(n1, n2, n3);

		System.out.println("o maior é: " + maior);

		sc.close();
	}

	public static int max(int a, int b, int c) {
		int aux;

		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}
		return aux;
	}

}
