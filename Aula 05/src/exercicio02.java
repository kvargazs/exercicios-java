// Descrição: Crie um programa Java que gere automaticamente um array de 10 números inteiros aleatórios entre 1 e 100. Em seguida, peça ao usuário para inserir um número e verifique se esse número está presente no array. Exiba uma mensagem indicando se o número foi encontrado ou não.

import java.util.Scanner;
import java.util.Random;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //criando número random:
        int[] numero = new int[10]; //cria um array para armazenar 10 numeros
        for (int i = 0; i < 10; i++) { //cria um loop do 0 ao 9
            numero[i] = random.nextInt(100) + 1; //gera um número aleatório entre 1 e 100
        }

        boolean tentativaCerta = false; //tentativa inicia falsa pois o usuário não sabe

        while (!tentativaCerta) { //loop para tentativas
            System.out.print("Digite um número de 1 a 100: "); //usuário digita um número
            int tentativa = scanner.nextInt(); //le e armazena na variavel tentativa

            for (int i = 0; i < 10; i++) { //percorre os arrays
                if (numero[i] == tentativa) { //se número random for igual número digitado -> usuário acerta e para o programa
                    tentativaCerta = true; //tentativa é verdadeira
                    System.out.println("Você acertou!!! O número certo era "+numero[i]);
                    break;
                }
            }
            if (!tentativaCerta) { //se a tentativa for falsa pergunta novamente
                System.out.println("Você errou :(. Tente novamente!");
            }
        }
        scanner.close();
    }
}
