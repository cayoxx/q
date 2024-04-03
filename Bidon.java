package elenco;
import java.util.Scanner;
public class Bidon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Você está se conectando ao Sistema SENAI.");
		System.out.println(".");
		System.out.println("Vamos criar uma conta.");
		System.out.println("==========================================");
		System.out.println("Crie seu Email:");
		String L = ler.next();
		System.out.println("==========================================");
		System.out.println("Crie sua Senha:");
		String S = ler.next();
		System.out.println("");
		System.out.println("Conta Criada!");
		System.out.println("");
		System.out.println("Entrando no sistema de Login.");
		System.out.println("==========================================");
		System.out.println("Informe seu Email:");
		String L2 = ler.next();
		System.out.println("==========================================");
		System.out.println("Crie sua Senha:");
		String S2 = ler.next();
		
		
		
		//processamento dos dados
		
		if (L.equals(L2)&&(S.equals(S2))) {
			System.out.println("Bem vindo ao Sistema Senai!");
		}
		else if (L.equals(L2)&&(!S.equals(S2))) {
			System.out.println("Senha Incorreta.");			
		}
		else {
			System.out.println("Email informado não existe, informe os dados novamente.");
		}
	}

}