
package elenco;

import java.util.Random;
import java.util.Scanner;

public class oi {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner ler = new Scanner(System.in);
        while (true) {
        System.out.println("=============");
        System.out.println("Time de Casa:");
        String casa = ler.next();
        System.out.println("=============");
        System.out.println("Time de Fora:");
        String fora = ler.next();
        int tempo = 0;
        int placarC = 0;
        int placarF = 0;

        while (true) {
            int atempo = random.nextInt(0,25	); // Gera um número aleatório entre 0 e 10
            int ataque = random.nextInt(1, 3); // Gerar um número aleatório entre 1 e 2
            int gol = random.nextInt(1, 4); // Gerar um número aleatório entre 1 e 3
            System.out.println("==========================");
            tempo = tempo + atempo;
            System.out.println("Tempo do jogo: " + tempo + "'");
            System.out.println(casa + " " + placarC + "x" + placarF + " " + fora);
            System.out.println("");

            switch (ataque) {
                case 1:
                    System.out.println("O time " + casa + " está atacando...");
                    break;
                case 2:
                    System.out.println("O time " + fora + " está atacando...");
                    break;
                default:
                    System.out.println("");
            }

            try {
                Thread.sleep(1000); // Pausa por 2 segundos (2000 milissegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (gol) {
                case 1:
                    if (ataque == 1) {
                        placarC++;
                        System.out.println("⚽ Gol do " + casa + "!");
                    } else if (ataque == 2) {
                        placarF++;
                        System.out.println("⚽ Gol do " + fora + "!");
                    }
                    break;
                case 2:
                    System.out.println("O chute acerta a trave!");
                    break;
                case 3:
                    System.out.println("O atacante é desarmado.");
                    break;
                default:
                    System.out.println("Chute péssimo do atacante.");
                    break;
            }

            try {
                Thread.sleep(1000); // Pausa por 2 segundos entre os lances
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            if (tempo >= 90) {
                System.out.println("Fim de jogo!");
                System.out.println(casa + " " + placarC + "x" + placarF + " " + fora);
                break; // Sai do loop quando o tempo ultrapassar 90 minutos
            }
        }
        }
    }
}
