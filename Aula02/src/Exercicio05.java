// 05. Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar. Leônidas pede para que seus soldados tentem adivinhar quantos inimigos irão combater. O usuário deve digitar seu palpite e se o número for menor do que 300.000, Leônidas deve dizer Um pouco mais!, caso o número dito pelo usuário seja menor, ele dirá Um pouco menos!".

import java.util.Scanner;
import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int palpite;

        // gera um número aleatório
        Random rand = new Random();
        int inimigos = rand.nextInt(300000); //gera um número aleatório entre 0 e 299,999

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < inimigos) {
                System.out.println("Um pouco mais!");
            } else if (palpite > inimigos) {
                System.out.println("Um pouco menos!");
            } else {
                System.out.println("Parabéns! Você acertou. Os espartanos enfrentarão " + inimigos + " inimigos.");
            }
        } while (palpite != inimigos);

        scanner.close();
    }
}
