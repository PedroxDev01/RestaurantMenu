package br.com.vainaweb.backendt3.introducaot3;

import java.util.Scanner;

public class MetodesTest {

	public static void main(String[] args) {
		
		// deseje boa noite
		// apresente o menu
		// leia a/as opções
		// caso mais de uma opção repita o menu
		// limpe a tela
		// caso escolhido a opão "sair" feche o menu
		// calcule o total
		// apresente o total
		// encerre o programa

		Scanner s = new Scanner(System.in);
		int opc;
		double t = 0.0;
		char i;
		
		System.out.println("Boa noite, seja bem vindo!");

		do {
			System.out.println("\nMenu:");
			System.out.println("\n1. Pizza | R$10.00");
			System.out.println("2. Churrasco | R$15.00");
			System.out.println("3. Massa | R$20.00");
			System.out.println("4. Refrigerante | R$5.00");
			System.out.println("5. Suco | R$3.00");
			System.out.println("6. SAIR\n");
			System.out.println("Escolha sua opção: ");
			opc = s.nextInt();
			
			for(i = 0; i < 50; i++) {
				System.out.println();
			}

			switch (opc) {
			case 1:
				System.out.println("OK! Pizza, algo mais?");
				t += 10.00;
				break;
			case 2:
				System.out.println("OK! Churrasco, algo mais?");
				t += 15.00;
				break;
			case 3:
				System.out.println("OK! Massa, algo mais?");
				t += 20.00;
				break;
			case 4:
				System.out.println("Certo! Algo mais?");
				t += 5.00;
				break;
			case 5:
				System.out.println("Certo! Algo mais?");
				t += 3.00;
				break;
			case 6:
				System.out.println("Perfeito! Total de: R$" + t);
				break;
			default:
				System.out.println("Desculpe. Opção inválida :(  tente novamente :)");
				break;
			}
		} while (opc != 6);
		s.close();
		
		System.out.println("\nFechando programa...");
	}

}
