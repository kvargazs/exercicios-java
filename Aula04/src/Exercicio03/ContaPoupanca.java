package Exercicio03;

import Exercicio03.Conta;

public class ContaPoupanca extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return 0; //conta poupança não é tributável
    }
}