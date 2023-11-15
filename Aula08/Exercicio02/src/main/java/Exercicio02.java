import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {
        List<Produto> listaDeProdutos = criarListaDeProdutos();

        //acha o produto mais caro da lista
        Produto produtoMaisCaro = listaDeProdutos.stream()
                .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .orElse(null);
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        //calcula o preço de todos os produtos da lista
        double precoTotal = listaDeProdutos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
        System.out.println("Preço total dos produtos: " + precoTotal);

        //filtra os produtos com quantidade maior a 10 e cria uma lista com eles
        List<Produto> produtosQuantidadeSuperior10 = listaDeProdutos.stream()
                .filter(p -> p.getQuantidade() > 10)
                .toList();
        System.out.println("Produtos com quantidade superior a 10: " + produtosQuantidadeSuperior10);
    }

    private static List<Produto> criarListaDeProdutos() {
        return List.of(
                new Produto("Celular", 2000.0, 7),
                new Produto("Notebook Dell G15", 5000, 5),
                new Produto("Coca-Cola 2L", 10, 20)
        );
    }
}