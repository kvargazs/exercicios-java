// 09. Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e, em seguida, calcule e exiba a idade.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é " + idade + " anos.");

        scanner.close();
    }
}