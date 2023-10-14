import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicio04 {
    public static void main(String[] args) {
        Map<String, Double> listaDeProdutos = new LinkedHashMap<>();

        //produtos
        listaDeProdutos.put("Mouse Delux", 201.98);
        listaDeProdutos.put("Teclado RK 75%", 334.54);
        listaDeProdutos.put("Controle 8bitdo Ultimate", 300.16);
        listaDeProdutos.put("Headset Logitech-G435", 278.14);
        listaDeProdutos.put("SSD NVMe Asgard 2TB", 700.00);
        listaDeProdutos.put("Memória Ram DDR5 16GB", 273.26);

        //lista de produtos
        System.out.println("Lista de Produtos:");
        for (Map.Entry<String, Double> entrada : listaDeProdutos.entrySet()) {
            System.out.println("Produto: " + entrada.getKey() + ", Preço: R$" + entrada.getValue());
        }
    }
}
