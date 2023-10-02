// 04. Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salarioMinimo = 1320;

        System.out.print("Digite seu salário: R$");
        double salario = scanner.nextInt(); //lendo salario

        double mediaSalario = salario/salarioMinimo;

        System.out.println("Seu salário é: R$" + salario);
        System.out.println("O salário mínimo é: R$" + salarioMinimo);
        System.out.println("A quantidade de vezes que seu salário vale salários mínimos é: " + mediaSalario);

        scanner.close();
    }
}