package Exercicio01;

class Circulo implements Desenhavel {
    private final String nome;

    public Circulo(String nome) {
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        System.out.println("Vou desenhar o " + nome);
    }
}