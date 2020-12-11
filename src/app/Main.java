package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudantes;




public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*int x = sc.nextInt();
		//criação de vetor em java
		double[] vet = new double[x];
		double media = 0;
		for (int i = 0; i < x; i++) {
			vet[i] = sc.nextDouble();
			media += vet[i];
		}
		System.out.print("Altura media: "+ media/x);
		sc.close();
		
		//vetor tipo referência
		*/
		Estudantes[] vet = new Estudantes[10];
		System.out.println("Qtd estudantes");
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.println("Informe nome");
			String nome = sc.nextLine();
			System.out.println("Informe email");
			String email = sc.nextLine();
			System.out.println("Informe o quarto de 0 a 9");
			int quarto = sc.nextInt();
			vet[quarto] = new Estudantes(nome,email);
			//media += vet[i];
			//media += vet[i];
		}
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] != null) {
				System.out.println(i+": "+vet[i]);
			}
		}
		
		

	}

}
