package Exercicio01;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio01 {
    public static void main(String[] args) {
        Stack<Livros> pilhaDeLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        pilhaDeLivros.push(new Livros("O apanhador no campo de centeio", "Ficção juvenil"));
        pilhaDeLivros.push(new Livros("Os sete maridos de Evelyn Hugo", "Romance"));
        pilhaDeLivros.push(new Livros("Na minha pele", "Autobiografia"));
        pilhaDeLivros.push(new Livros("A lenda do Muri-Keko", "Infantil"));

        while (!sair && !pilhaDeLivros.isEmpty()) {
            System.out.println("Elementos da pilha de livros:"); //mostra os elementos da pilha com números

            int numeroLivro = 1;
            for (Livros livro : pilhaDeLivros) {
                System.out.println(numeroLivro + ". Título: " + livro.getTitulo() + ", Categoria: " + livro.getCategoria());
                numeroLivro++;
            }

            //remove um elemento
            System.out.print("\nDigite o número do livro que deseja remover (ou 0 para sair): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                sair = true;
            } else if (escolha >= 1 && escolha <= pilhaDeLivros.size()) {
                Livros livroRemovido = pilhaDeLivros.remove(pilhaDeLivros.size() - escolha);
                System.out.println("Livro removido: " + livroRemovido.getTitulo());
            } else {
                System.out.println("Número de livro inválido. Digite 0 para sair ou o número do livro a ser removido.");
            }
        }
        //verifica se a pilha está vazia
        if (pilhaDeLivros.isEmpty() || sair) {
            System.out.println("\nA pilha de livros está vazia ou o usuário escolheu sair.");
        } else {
            System.out.println("\nA pilha de livros não está vazia.");
        }
        scanner.close();
    }
}