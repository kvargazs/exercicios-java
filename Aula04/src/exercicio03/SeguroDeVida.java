package exercicio03;

public class SeguroDeVida implements Tributavel {
    @Override
    public double calculaTributos() {
        return 42.0; //tributação fixa de R$ 42,00
    }
}