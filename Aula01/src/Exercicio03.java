// 03. Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        //segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        //terceiro número
        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        //maior número
        int maior = Math.max(Math.max(numero1, numero2), numero3);

        //menor número
        int menor = Math.min(Math.min(numero1, numero2), numero3);

        //média
        double media = (numero1 + numero2 + numero3)/3;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média entre eles é: " + media);

        scanner.close();
    }
}
