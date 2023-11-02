class Quadrado implements Desenhavel {
    private final String nome;

    public Quadrado(String nome) {
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        System.out.println("Vou desenhar o " + nome);
    }
}