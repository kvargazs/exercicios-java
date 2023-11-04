package Exercicio02;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Exercicio02 {
    public static void main(String[] args) {
        List<Produto> produtos = criarListaProdutos();

        // encontra o produto mais caro da lista
        Produto produtoMaisCaro = produtos.stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElse(null);
        System.out.println("Exercicio02.Produto mais caro: " + produtoMaisCaro.getNome());

        // calcula o preço total de todos os produtos
        double precoTotal = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
        System.out.println("Preço total de todos os produtos: " + precoTotal);

        // filtra os produtos com quantidade maior que 10 e cria uma lista nova
        List<Produto> produtosComQuantidadeMaiorQue10 = produtos.stream()
                .filter(p -> p.getQuantidade() > 10)
                .toList();
        //System.out.println("Produtos com quantidade > 10: " + produtosComQuantidadeMaiorQue10);

        // imprime os nomes dos produtos da nova lista
        System.out.println("\nLista dos produtos com quantidade > 10: ");
        produtosComQuantidadeMaiorQue10.forEach(p -> System.out.println(p.getNome()));
    }

    private static List<Produto> criarListaProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 5000, 5));
        produtos.add(new Produto("Celular", 2000, 9));
        produtos.add(new Produto("Mouse", 200, 12));
        produtos.add(new Produto("Garrafa", 30, 20));
        return produtos;
    }
}
