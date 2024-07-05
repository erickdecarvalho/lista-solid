package SRP;

import java.util.ArrayList;

public class Relatorio {
    private ArrayList<String> relatorio = new ArrayList<>();

    public Relatorio() {
    }

    public void gerarRelatorio(ArrayList<String> vendas) {
        this.relatorio.addAll(vendas);
    }

    public void imprimirRelatorio() {
        System.out.println("\n========== RELATÓRIO DE VENDAS ==========");
        for (String venda : relatorio) {
            System.out.println(venda);
        }
        System.out.println();
    }
}
