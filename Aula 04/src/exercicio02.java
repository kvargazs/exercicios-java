import java.util.ArrayList;
import java.util.List;

public class exercicio02 {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>(); //lista das formas geométricas

        formas.add(new Retangulo(7, 2));
        formas.add(new Circulo(10));
        formas.add(new Triangulo(5, 8));
        formas.add(new Quadrado(4));
        formas.add(new Losango(4, 6));

        //calculo
        for (int i = 0; i < formas.size(); i++) {
            FormaGeometrica forma = formas.get(i);
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
