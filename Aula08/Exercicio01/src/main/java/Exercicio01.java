import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio01 {
    public static void main(String[] args) {
        List<String> listaDeStrings = Arrays.asList(
                "CS", "LoL", "RDR2", "TLOU", "FallGuys", "Minecraft", "CS", "RDR2", "CS", "Minecraft"
        );
        //número total de strings
        long totalDeStrings = listaDeStrings.size();
        System.out.println("Total de strings: " + totalDeStrings);

        //string mais longa
        String stringMaisLonga = listaDeStrings.stream()
                .max((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .orElse(null);
        System.out.println("String mais longa: " + stringMaisLonga);

        //5 strings mais frequentes
        Map<String, Long> contagemPorString = listaDeStrings.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        //contagem decrescente
        ((Map<?, ?>) contagemPorString).entrySet().stream()
                .sorted((e1, e2) -> Long.compare((long) e2.getValue(), (long) e1.getValue()))
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}