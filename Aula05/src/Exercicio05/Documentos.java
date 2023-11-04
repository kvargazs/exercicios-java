package Exercicio05;

import java.util.LinkedList;
import java.util.Scanner;

class Documentos {
    private String nome;
    private int numeroPaginas;

    public Documentos(String nome, int numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
