package elenco;

import java.util.Scanner;

public class Maycon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int mes;
		
		while (true) {
		System.out.println("========================");
		System.out.println("Informe um mês (1 a 12): ");
		mes = ler.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("É Janeiro!");
			break;
		case 2:
			System.out.println("É Fevereiro!");
			break;
		case 3:
			System.out.println("É Março");
			break;
		case 4:
			System.out.println("É Abril");
			break;
		case 5:
			System.out.println("É Maio!");
			break;
		case 6:
			System.out.println("É Junho!");
			break;
		case 7:
			System.out.println("É Julho!");
			break;
		case 8:
			System.out.println("É Agosto!");
			break;
		case 9:
			System.out.println("É Setembro!");
			break;
		case 10:
			System.out.println("É Outubro!");
			break;
		case 11:
			System.out.println("É Novembro!");
			break;
		case 12:
			System.out.println("É Dezembro!");
			break;
		default:
			System.out.println("Inválido.");
		}
		}
}
}
