class Contatos {
    private String telefone;
    private String nome;
    private String endereco;
    private String local;

    public Contatos(String telefone, String nome, String endereco, String localidade) {
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
        this.local = localidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "Telefone: " + formatarTelefone(telefone) + ", Endereço: " + endereco + ", Localidade: " + local;
    }
    private String formatarTelefone(String telefone) {
        return telefone.substring(0, 2) + "-" + telefone.substring(2, 5) + "-" + telefone.substring(5);
    }
}