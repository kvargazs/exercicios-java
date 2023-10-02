// 02. Crie um programa que receba 2 números e imprima na tela.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        //imprimindo na tela
        System.out.println("Os números digitados são: " + numero1 + " e " + numero2);
        scanner.close();
    }
}
