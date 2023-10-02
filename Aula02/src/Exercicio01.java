// 01. Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para iniciar o intervalo: ");
        int numIniciar = scanner.nextInt();
        System.out.print("Digite um número para terminar o intervalo: ");
        int numTerminar = scanner.nextInt();

        System.out.print("Os números primos dentro do intevalo de "+numIniciar+" a "+numTerminar+" são: ");

        for (int numero = numIniciar; numero <= numTerminar; numero++) { //o loop percorre todos os números no intervalo de 'numIniciar' a 'numTerminar'
            if (primo(numero)) {
                System.out.print(numero + " ");
            }
        }
        scanner.close();
    }
    // verificar se um número é primo ou não
    public static boolean primo(int numero) { //aceita um parâmetro numero inteiro e retorna um valor booleano (true se for primo, false se não for)
        if (numero <= 1) {
            return false; // verifica se o número é menor ou igual a 1. Qualquer número menor ou igual a 1 não é primo, então a função retorna false
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // usando 'Math.sqrt(numero)' para raiz quadrada do 'numero'
            if (numero % i == 0) { // a função verifica se numero é divisível por 2
                return false;
            }
        }
        return true;
    }
}
