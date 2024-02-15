package estrutura_sequencial;

import java.util.Scanner;

public class Entrada_Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * String x;
		 * x = sc.next(); //String 
		 * System.out.println("Voce digitou: " + x);
		 * 
		 * //--------------
		 * 
		 * int x; 
		 * x = sc.nextInt(); //Inteiro 
		 * System.out.println("Voce digitou: " + x);
		 * 
		 * //--------------
		 * 
		 * double x; 
		 * x = sc.nextDouble(); //Flutuante
		 * System.out.println("Voce digitou: " + x);
		 * 
		 * //--------------
		 * 
		 * char x; 
		 * x = sc.next().charAt(0); //Caracter
		 * System.out.println("Voce digitou: " + x); 
		 * String x; 
		 * int y; 
		 * double z; 
		 * x = sc.next(); 
		 * y = sc.nextInt(); 
		 * z = sc.nextDouble();
		 * System.out.println("Dados digitados: "); 
		 * System.out.println(x);
		 * System.out.println(y); 
		 * System.out.println(z);
		 */
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
