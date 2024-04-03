package elenco;
import java.util.Scanner;	

public class Conorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt;
		int num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a palavra: ");
		txt = ler.next();
		
		System.out.println("Escolha a posição a ser lida: ");
		num = (int) ler.nextDouble() - 1;
		
		
		int tamanho = txt.length();
		char letra = txt.charAt(num);
		String ola = "Oi";
	
		
		System.out.println("Na palavra " + txt + " há " + tamanho + " caracteres");
		System.out.println("O caractere informado é " + letra);
		
		if(txt.equals(ola))
		   System.out.println("Sua palavra é igual a Oi");
		
				
	
	}

}
