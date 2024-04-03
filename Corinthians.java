package elenco;

import java.util.Scanner;

public class Corinthians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double bonus;
		Scanner ler = new Scanner(System.in);
		System.out.println("==============================================================");
		System.out.println("Qual seu salário?");
		double salario = ler.nextDouble();
		System.out.println("Quantos anos na empresa?");
		int anos = ler.nextInt();
		
		if (anos <= 3) {
			bonus =(salario*0.05);
			salario = salario + bonus;
			System.out.println("Seu salário é R$ " + salario + " o bônus sendo de R$" + bonus + ".");
		}
		else {
			bonus = salario*0.07;
			salario = salario + bonus;
			System.out.println("Seu salário é R$ " + salario + " o bônus sendo de R$" + bonus + ".");
		}
		System.out.println("==============================================================");
		
		

	}

}
