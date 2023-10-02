// 13. Escreva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário. O fatorial de um número N é o produto de todos os inteiros de 1 até N.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número maior que zero: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);

        scanner.close();
    }
}
