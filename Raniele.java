package elenco;
import java.util.Scanner;
public class Raniele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int a,b,c,d,x;
		
		System.out.println("Informe a primeira nota: ");
		a = ler.nextInt();
		System.out.println("Informe a segunda nota: ");
		b= ler.nextInt();
		System.out.println("Informe a terceira nota: ");
		c= ler.nextInt();
		System.out.println("Informe a quarta nota: ");
		d= ler.nextInt();
		
		x = (a+b+c+d)/4;
		
		if (x > 6) {
			System.out.println("Sua média é " + x + " logo é aprovada!");
		}
		else if (x < 4) {
			System.out.println("Sua média é " + x + " logo é reprovada!");
		}
		else {
			System.out.println("Sua média é " + x + " logo ficará de recuperação.");
		}

	}

}
