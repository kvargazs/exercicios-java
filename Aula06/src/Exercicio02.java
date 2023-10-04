import java.util.HashMap;
import java.util.Map;

public class Exercicio02 {
    public static void main(String[] args) {
        Map<String, Integer> mapaDeIdades = new HashMap<>();

        mapaDeIdades.put("Karol", 18);
        mapaDeIdades.put("João", 20);
        mapaDeIdades.put("Lucas", 46);
        mapaDeIdades.put("Maria", 39);
        mapaDeIdades.put("Julia", 83);

        //mostra a idade do nome
        String nomeParaConsultar = "Alex";
        if (mapaDeIdades.containsKey(nomeParaConsultar)) {
            int idade = mapaDeIdades.get(nomeParaConsultar);
            System.out.println(nomeParaConsultar + " tem " + idade + " anos.");
        } else {
            System.out.println(nomeParaConsultar + " não está presente no mapa.");
        }

        //mostra os nomes das pessoas que estão na terceira idade (>60)
        System.out.println("\nPessoas na terceira idade:");
        for (Map.Entry<String, Integer> entrada : mapaDeIdades.entrySet()) {
            String nome = entrada.getKey();
            int idade = entrada.getValue();
            if (idade > 60) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        }
    }
}





