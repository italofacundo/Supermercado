package Entidades;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        StringBuilder recibo = new StringBuilder();
        double total = 0.0;

        recibo.append("Recibo de Venda\n");
        recibo.append("-------------------------------\n");

        for (Map.Entry<Produto, Integer> entrada : produtosVendidos.entrySet()) {
            double subtotal = entrada.getKey().getPreco() * entrada.getValue();
            total += subtotal;
            recibo.append(String.format("%s x%d - R$%.2f\n", entrada.getKey().getNome(), entrada.getValue(), subtotal));
        }

        recibo.append("-------------------------------\n");
        recibo.append(String.format("Total: R$ %.2f\n", total));

        System.out.println(recibo);

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String nomeArquivo = "Recibo_" + agora.format(formatter) + ".txt";
        String caminhoArquivo = "src/recibos/" + nomeArquivo;

        try (PrintWriter writer = new PrintWriter(new File(caminhoArquivo))) {
            writer.print(recibo.toString());
            System.out.println("Recibo salvo em: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o recibo: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Venda{" +
                "produtosVendidos=" + produtosVendidos +
                ", estoque=" + estoque +
                ", totalVenda=" + totalVenda +
                '}';
    }
}
