package exercicio02;

//Exercicio02.Losango
class Losango extends FormaGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMenor, double diagonalMaior) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMaior = diagonalMaior;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}