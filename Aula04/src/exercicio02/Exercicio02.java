package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>(); //lista das formas geométricas

        formas.add(new Retangulo(7, 2)); //define a  largura e altura do retângulo
        formas.add(new Circulo(10)); //define o raio do circulo
        formas.add(new Triangulo(5, 8)); //define a base e a altura do trângulo
        formas.add(new Quadrado(4)); //define o lado do quadrado
        formas.add(new Losango(4, 6)); //define as diagonais do losango

        //calculo
        for (int i = 0; i < formas.size(); i++) {
            FormaGeometrica formaGeometrica = formas.get(i); //pega o elemento atual da lista 'formas' no índice 'i' e atribui à variável formaGeometrica
            System.out.println("Área: " + formaGeometrica.calcularArea());
        }
    }
}
