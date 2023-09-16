// 08. Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir um menu de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou Nenhuma das alternativas. Se ela for PCD, Idosa ou Gestante, tem direito a fila prioritária. Se não, não tem direito."

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione sua condição: \n1 - Gestante \n2 - Idosa \n3 - Pessoa com deficiência (PCD) \n4 - Nenhuma das alternativas");
        int opcao = scanner.nextInt();

        if (opcao == 1 || opcao == 2 || opcao == 3) {
            System.out.println("Tem direito à fila prioritária!");
        } else if (opcao == 4) {
            System.out.println("Não tem direito à fila prioritária!");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
