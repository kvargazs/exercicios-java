import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercicio03 {

    @Test
    public void testAdicao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5.0, calculadora.adicao(2.0, 3.0), 0.0001);
    }
    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.subtracao(5.0, 3.0), 0.0001);
    }
    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(15.0, calculadora.multiplicacao(5.0, 3.0), 0.0001);
    }
    @Test
    public void testDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.5, calculadora.divisao(5.0, 2.0), 0.0001);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        calculadora.divisao(5.0, 0.0);
    }
    @Test
    public void testRaizQuadrada() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.raizQuadrada(4.0), 0.0001);
    }
    @Test(expected = ArithmeticException.class)
    public void testRaizQuadradaDeNumeroNegativo() {
        Calculadora calculadora = new Calculadora();
        calculadora.raizQuadrada(-4.0);
    }
    @Test
    public void testPotencia() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8.0, calculadora.potencia(2.0, 3.0), 0.0001);
    }
}