package exercicio04;

// lista de compras
public class Exercicio04 {
    private String data;
    private String nome;
    private int quantidade;

    public Exercicio04(String nome, String data, int quantidade) {
        this.nome = nome;
        this.data = data;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public String getData() {
        return data;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
