package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo,
		// e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		// Fórmula da área: area = π . raio^2
		// Considere o valor de π = 3.14159

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor do raio: ");
		double raio = sc.nextDouble();
		double area = 3.14159 * (raio * raio);

		System.out.printf("Area do circulo: %.4f ", area);

		sc.close();

	}

}
