package Exercicio01;

//classe concreta Exercicio01.Carro - herda de Veiculo
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calculaCustoViagem(int distancia) {
        return 0.20 * distancia; //custo de R$0.20 por quilômetro
    }
}
