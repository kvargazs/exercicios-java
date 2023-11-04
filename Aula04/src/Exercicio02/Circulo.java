package Exercicio02;

//Exercicio02.Exercicio02.Exercicio02.Circulo
class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; //calculo da área de um círculo
    }
}
