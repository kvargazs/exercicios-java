//classe concreta Moto - herda de Veiculo
class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calculaCustoViagem(int distancia) {
        return 0.15 * distancia; //custo de R$0.15 por quilômetro
    }
}
