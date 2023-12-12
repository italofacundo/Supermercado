package Entidades;

import Entidades.Repositorios.Estoque;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class MenuVendas {
    private Scanner scanner;

    public MenuVendas() {
        this.scanner = new Scanner(System.in);
    }

    public Map<Produto, Integer> selecionarProdutos(Estoque estoque) {
        Map<Produto, Integer> produtosSelecionados = new HashMap<>();
        System.out.println("Bem-vindo ao Supermercado!");

        while (true) {
            System.out.println("Produtos disponíveis:");
            List<String> produtos = estoque.imprimirProdutosCliente();
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i));
            }
            System.out.println("0. Finalizar seleção");

            System.out.print("Selecione um produto pelo número ou finalize (0): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            if (escolha > 0 && escolha <= produtos.size()) {
                Produto produtoEscolhido = estoque.getProdutoCliente(escolha - 1);

                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();
                produtosSelecionados.put(produtoEscolhido, produtosSelecionados.getOrDefault(produtoEscolhido, 0) + quantidade);
            } else {
                System.out.println("Seleção inválida.");
            }
            scanner.nextLine();
        }

        return produtosSelecionados;
    }
}
