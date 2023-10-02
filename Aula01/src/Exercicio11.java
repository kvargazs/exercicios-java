// 11. Peça ao usuário que digite uma palavra ou frase e conte quantas vogais (a, e, i, o, u) estão presentes. Exiba o número de vogais na tela.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++) { //loop continuará enquanto 'i' for menor que o comprimento da string 'palavra'
            char caractere = palavra.charAt(i); //char representa um único caractere, como uma letra, um dígito ou um símbolo
            //'charAt(i)' é um método em Java usado para obter o caractere na posição especificada dentro da string

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + contadorVogais);

        scanner.close();
    }
}
