package Exercicio04;

import Exercicio04.Exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<Exercicio04> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Escolha uma opção:\n");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Exibir lista de compras");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: //adiciona item à lista
                    System.out.print("Nome: ");
                    String nomeItem = scanner.nextLine();
                    System.out.print("Data de validade: ");
                    String data = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    Exercicio04 novoItem = new Exercicio04(nomeItem, data, quantidade);
                    listaCompras.add(novoItem);
                    System.out.println("Item adicionado à lista de compras! \n");
                    break;

                case 2: //remove item da lista
                    if (!listaCompras.isEmpty()) { //verifica se a lista de compras não está vazia
                        System.out.println("Itens na lista de compras: ");
                        for (int i = 0; i < listaCompras.size(); i++) {
                            Exercicio04 item = listaCompras.get(i);
                            System.out.println((i + 1) + ". " + item.getNome() + " (Data de Validade: " + item.getData() + ") - Quantidade: " + item.getQuantidade());
                        }
                        System.out.print("Digite o número do item a ser removido: "); //solicita ao usuário que digite o número do item que deseja remover
                        int indiceRemover = scanner.nextInt();
                        if (indiceRemover >= 1 && indiceRemover <= listaCompras.size()) {
                            listaCompras.remove(indiceRemover - 1);
                            System.out.println("Item removido da lista de compras! \n");
                        } else {
                            System.out.println("Número inválido! "); //se número for inválido o programa exibe uma mensagem de "Número inválido!"
                        }
                    } else {
                        System.out.println("A lista de compras está vazia! \n");
                    }
                    break;

                case 3: //mostra itens da lista
                    if (!listaCompras.isEmpty()) {
                        System.out.println("Itens na lista:");
                        for (int i = 0; i < listaCompras.size(); i++) {
                            Exercicio04 item = listaCompras.get(i);
                            System.out.println((i + 1) + ". Nome: " + item.getNome());
                            System.out.println("   Data de Validade: " + item.getData());
                            System.out.println("   Quantidade: " + item.getQuantidade());
                        }
                    } else {
                        System.out.println("A lista de compras está vazia!\n");
                    }
                    break;

                case 4: //sai do programa
                    System.out.println("Saindo... Bye");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida! \n");
            }
        }
    }
}