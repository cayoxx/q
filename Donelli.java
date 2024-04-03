package elenco;

import java.util.Scanner;

public class Donelli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		while (true) {
		System.out.println("--------------------------");
		System.out.println("Digite um número de 1 a 3");
		int x = ler.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("Número escolhido foi 1.");
			break;
		case 2:
			System.out.println("Número escolhido foi 2.");
			break;
		case 3:
			System.out.println("Número escolhido foi 3.");
			break;
		default:
			System.out.println("Número inválido.");
			
		}

		}

	}

}
