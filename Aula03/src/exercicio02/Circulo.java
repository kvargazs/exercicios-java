package exercicio02;

public class Circulo {
    private final double raio;

    //construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //método que calcula a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    //método que calcula a circunferência do círculo
    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public String toString() {
        return "Círculo [Raio=" + raio + ", Área=" + calcularArea() + ", Circunferência=" + calcularCircunferencia() + ", Diâmetro=" + calcularDiametro() + "]";
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public boolean doisCirculos(Circulo segundoCirculo) {
        return this.raio == segundoCirculo.raio;
    }
}
