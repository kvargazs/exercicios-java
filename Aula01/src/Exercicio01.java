// 01. Crie um programa que leia seu nome e imprima na tela.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é " + nome);
        scanner.close();
    }
}


