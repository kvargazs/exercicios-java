public class Calculadora {

    public double adicao(double a, double b) {
        return a + b;
    }
    public double subtracao(double a, double b) {
        return a - b;
    }
    public double multiplicacao(double a, double b) {
        return a * b;
    }
    public double divisao(double a, double b) {
        return a / b;
    }
    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    public double calcularPagamentoHipoteca(double principal, double taxaDeJurosAnual, int prazoEmAnos) {
        int numeroDePagamentos = prazoEmAnos * 12;
        double taxaDeJurosMensal = taxaDeJurosAnual / 12 / 100;
        double pagamentoMensal = (principal * taxaDeJurosMensal) /
                (1 - Math.pow(1 + taxaDeJurosMensal, -numeroDePagamentos));
        return pagamentoMensal;
    }
}