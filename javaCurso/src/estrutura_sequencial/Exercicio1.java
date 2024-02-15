package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e 
		//depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		Scanner sc = new Scanner(System.in);
		int x,y,result;
		
		System.out.print("Informe o primeiro número para soma: ");
		x = sc.nextInt();
		System.out.print("Informe o segundo número para soma: ");
		y = sc.nextInt();
				
		result = x + y;
				
		System.out.printf("A soma entre %d e %d é: %d \n", x, y, result);
				
		sc.close();

	}

}
