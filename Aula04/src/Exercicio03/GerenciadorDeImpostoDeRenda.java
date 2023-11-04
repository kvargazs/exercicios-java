package Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda {
    private double totalImposto;
    private List<Tributavel> tributaveis;

    public GerenciadorDeImpostoDeRenda() {
        totalImposto = 0;
        tributaveis = new ArrayList<>();
    }

    public void adicionar(Tributavel tributavel) {
        tributaveis.add(tributavel);
        totalImposto += tributavel.calculaTributos();
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
