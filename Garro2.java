package elenco;

import java.util.Scanner;

public class Garro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		double x;
		
		System.out.println("Informe um valor:");
		x = ler.nextDouble();
		 
		System.out.println(x % 5 == 0 ? ("O número " + x + " é multiplo de 5"):("O número " + x + " não é multiplo de 5") );
		ler.close();
	}
      
}
