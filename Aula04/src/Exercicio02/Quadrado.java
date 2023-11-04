package Exercicio02;

import Exercicio02.FormaGeometrica;

//Exercicio02.Quadrado
class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

