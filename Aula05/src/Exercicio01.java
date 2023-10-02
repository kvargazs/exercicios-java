// Descrição: Crie um programa Java que peça ao usuário para inserir 5 números inteiros e armazene-os em um array. Em seguida, calcule e exiba a soma e a média dos números inseridos.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declarando variaveis
        int[] numeros = new int[5];
        int soma = 0;

        System.out.print("Digite 5 números: "); //usuário digite 5 números
        for (int i = 0; i < 5; i++) { //contador para a quantidade de números
            numeros[i] = scanner.nextInt(); //scanner le cada um e armazena no array
            soma += numeros[i]; //soma de todos os números digitados pelo usuário
        }

        scanner.close();

        double media = (double) soma / 5; //pega a soma e divide por 5

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}