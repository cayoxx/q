package elenco;
import java.util.Scanner;

public class Wesley {
	
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	int num;
	
	System.out.println("Informe o número: ");
	num = ler.nextInt();
	
	if (num > 0) {
		System.out.println("Seu número é positivo.");
	}
	
	else if (num == 0) {
		System.out.println("O número é zero");
	}
	else {
		System.out.println("Seu número é negativo.");
	}
	ler.close();
	
	}
}
