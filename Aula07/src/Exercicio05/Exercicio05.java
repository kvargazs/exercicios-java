package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try {
            System.out.println("Digite sua idade: ");
            int idade = lerIdade();
            validarIdade(idade);
            System.out.println("Idade válida: " + idade);
        } catch (IdadeInvalidaException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
    public static int lerIdade() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void validarIdade(int idade) {
        if (idade < 0 || idade > 150) {
            throw new IdadeInvalidaException("Idade inválida! A idade deve ser entre 0 e 150 anos.");
        }
    }
}
