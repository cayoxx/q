package elenco;

import java.util.Scanner;

public class ArthurSouza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Que turno você estuda?");
		System.out.println("M - Matutino");
		System.out.println("V - Vespertino");
		System.out.println("N - Noturno");
		System.out.println("========================");
		String X = ler.nextLine();
		
		if (X.equals("M")) {
			System.out.println("Bom Dia!");
		}
		else if (X.equals("V")) {
			System.out.println("Boa Tarde!");
		}
		else if (X.equals("N")) {
			System.out.println("Boa Noite!");
		}
		else {
			System.out.println("Valor Inválido.");
		}

	}

}
