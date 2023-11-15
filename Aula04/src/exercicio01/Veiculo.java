package exercicio01;

abstract class Veiculo {
    private String modelo;
    private String marca;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calculaCustoViagem(int distancia); //calcula o custo da viagem com base na distância

    //getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
}
