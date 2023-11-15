import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercicio04 {

    @Test
    public void testAdicao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.adicao(7, 3), 0.0001);
    }
    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.subtracao(10, 5), 0.0001);
    }
    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(24, calculadora.multiplicacao(4, 6), 0.0001);
    }
    @Test
    public void testDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(50, calculadora.divisao(100, 2), 0.0001);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        calculadora.divisao(2, 0);
    }
    @Test
    public void testRaizQuadrada() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.raizQuadrada(4), 0.0001);
    }
    @Test
    public void testPotencia() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8, calculadora.potencia(2, 3), 0.0001);
    }
    @Test
    public void testCalcularPagamentoHipoteca() {
        Calculadora calculadora = new Calculadora();
        double principal = 10000;
        double taxaDeJurosAnual = 5;
        int prazoEmAnos = 30;

        double pagamentoMensalEsperado = 1073.64;
        double resultado = calculadora.calcularPagamentoHipoteca(principal, taxaDeJurosAnual, prazoEmAnos);

        assertEquals(pagamentoMensalEsperado, resultado, 0.01);
    }
}