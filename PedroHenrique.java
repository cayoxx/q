package elenco;
import java.util.Scanner;
public class PedroHenrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Você está se conectando ao Sistema SENAI.");
		System.out.println("==========================================");
		System.out.println("Informe seu Login:");
		String L = ler.next();
		System.out.println("==========================================");
		System.out.println("Informe sua Senha:");
		String S = ler.next();
		
		//processamento dos dados
		
		if (L.equals("caio1234@gmail.com")&&S.equals("1234")) {
			System.out.println("Bem vindo ao Sistema Senai!");
		}
		else if (L.equals("caio1234@gmail.com")&&!S.equals("1234")) {
			System.out.println("Senha Incorreta.");			
		}
		else {
			System.out.println("Email informado não existe, informe os dados novamente.");
		}
	}

}
