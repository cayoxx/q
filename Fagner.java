package elenco;
import java.util.Scanner;
public class Fagner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		String dia;
		
		System.out.println("Digite o dia da semana (o primeiro nome):");
		dia = ler.next();
		
		if (dia.equals("Domingo")) {
			System.out.println("É o dia 1");
		}
		else if (dia.equals("Segunda")) {
			System.out.println("É o dia 2");
		}
		else if (dia.equals("Terça")) {
			System.out.println("É o dia 3");
		}
		else if (dia.equals("Quarta")) {
			System.out.println("É o dia 4");
		}
		else if (dia.equals("Quinta")) {
			System.out.println("É o dia 5");
		}
		else if (dia.equals("Sexta")) {
			System.out.println("É o dia 6");
		}
		else if (dia.equals("Sábado")) {
			System.out.println("É o dia 7");
		}
		else {
			System.out.println("É inválido.");
		}

	}

}
