// 03. Escreva um programa que separa a string em duas metades e imprime a primeira parte.

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua frase/palavra: "); //digitando a palavra/texto
        String texto = scanner.nextLine(); //lendo texto
        int metade = texto.length() / 2; //dvidindo o texto no meio

        //declarando metades
        String metade1 = texto.substring(0, metade);
        String metade2 = texto.substring(metade);

        System.out.println("Metade 1: " + metade1);
        System.out.println("Metade 2: " + metade2);

        scanner.close();
    }
}
