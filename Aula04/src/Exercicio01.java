public class Exercicio01 {
    public static void main(String[] args) {
        Carro primeiroCarro = new Carro("Mercedes", "AMG GT 63", 2021); //objeto carro

        //calculando o custo de uma viagem de 100 quilômetros com o carro
        int distanciaViagemCarro = 200;
        double custoViagemCarro = primeiroCarro.calculaCustoViagem(distanciaViagemCarro);
        System.out.println("Viagem de carro: R$" +custoViagemCarro);

        //==============================================================================================================

        Moto primeiraMoto = new Moto("Yamaha", "MT - 03", 2023); //objeto moto

        // Calculando o custo de uma viagem de 100 quilômetros com a moto
        int distanciaViagemMoto = 200;
        double custoViagemMoto = primeiraMoto.calculaCustoViagem(distanciaViagemMoto);
        System.out.println("Viagem de moto: R$" + custoViagemMoto);
    }
}
