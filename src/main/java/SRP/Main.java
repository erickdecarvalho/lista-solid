package SRP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> vendas = new ArrayList<>();

        int opcao = 1;
        do {
            System.out.println("Escolha uma opção\n1 - Adicionar venda\n2 - Ver relatório\n0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade e o produto (Exemplo: 50 bermudas)");
                    String venda = scanner.nextLine();
                    vendas.add(venda);
                    break;
                case 2:
                    Relatorio r1 = new Relatorio();
                    r1.gerarRelatorio(vendas);
                    r1.imprimirRelatorio();
                    break;
            }
        } while (opcao != 0);
        scanner.close();


    }
}
