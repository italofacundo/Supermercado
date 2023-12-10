package Entidades;

import java.util.HashMap;
import java.util.Map;

import Entidades.Repositorios.Estoque;

public class Venda {
    private Map<Produto, Integer> produtosVendidos;
    private Estoque estoque;
    private double totalVenda;

    public Venda(Estoque estoque) {
        this.produtosVendidos = new HashMap<>();
        this.estoque = estoque;
        this.totalVenda = 0.0;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (estoque.consultarDisponibilidade(produto, quantidade)) {
            produtosVendidos.putIfAbsent(produto, 0);
            produtosVendidos.put(produto, produtosVendidos.get(produto) + quantidade);
            totalVenda += produto.getPreco() * quantidade;
        } else {
            System.out.println("Quantidade insuficiente no estoque para o produto: " + produto.getNome());
        }
    }

    public void concluirVenda() {
        for (Map.Entry<Produto, Integer> entrada : produtosVendidos.entrySet()) {
            Produto produto = entrada.getKey();
            Integer quantidade = entrada.getValue();
            estoque.removerProduto(produto, quantidade);
        }
        emitirRecibo();
        produtosVendidos.clear();
        totalVenda = 0.0;
    }

    private void emitirRecibo() {
        System.out.println("Recibo");
        System.out.println("-------------------------------");

        for (Map.Entry<Produto, Integer> entrada : produtosVendidos.entrySet()) {
            Produto produto = entrada.getKey();
            Integer quantidade = entrada.getValue();
            double subtotal = produto.getPreco() * quantidade;
            System.out.printf("%s - Quantidade: %d, Preço Unitário: R$ %.2f, Subtotal: R$ %.2f\n",
                    produto.getNome(), quantidade, produto.getPreco(), subtotal);
        }

        System.out.println("-------------------------------");
        System.out.printf("Total da Venda: R$ %.2f\n", totalVenda);
    }
}
