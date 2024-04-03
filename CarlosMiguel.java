package elenco;

import java.util.Scanner;

public class CarlosMiguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int X,Y;
		
		System.out.println("Informe um número:");
		int A = ler.nextInt();
		System.out.println("Informe um número:");
		int B = ler.nextInt();
		System.out.println("Informe um número:");
		int C = ler.nextInt();
		
		if (A > B&&A>C) {
			X = A;
			System.out.println("O maior número é " + X);
		}
		else if (B > A&&B>C) {
			X = B;
			System.out.println("O maior número é " + X);
		}
		else if (A==B&&A==C) {
			X = A;
			System.out.println("Os 3 números são iguais, o valor é " + X);
		}
		else {
			X = C;
			System.out.println("O maior número é " + X);
		}
		if (A<B&&A<C) {
			Y = A;
			System.out.println("O menor número é " + Y);
		}
		else if (B<A&&B<C) {
			Y = B;
			System.out.println("O menor número é " + Y);
		}
		else if (A==B&&A==C) {
			System.out.println("Não é menor entre eles.");
		}
		else {
			Y = C;
			System.out.println("O menor número é " + Y);
		}

	}

}
