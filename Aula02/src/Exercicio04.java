// 04. Escreva um programa que receba uma string do usuário e imprima ela ao contrário

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String inverter = new StringBuilder(palavra).reverse().toString();

        System.out.println("Palavra digitada: " + palavra);
        System.out.println("Palavra invertida: " + inverter);
        scanner.close();
    }
}
