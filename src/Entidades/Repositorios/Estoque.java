package Entidades.Repositorios;

import Entidades.Produto;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> estoqueProdutos;
    private int codigo = 1;

    public Estoque() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        boolean produtoEncontrado = false;

        for (Produto p : estoqueProdutos.keySet()) {
            if (p.getNome().equals(produto.getNome())) {
                estoqueProdutos.put(p, estoqueProdutos.get(p) + quantidade);
                produtoEncontrado = true;

                String mensagem = """
                Estoque do produto atualizado.
                Código do produto: %d
                Nome do produto: %s
                Tipo do produto: %s
                Quantidade do produto: %d
                """.formatted(p.getCodigo(), p.getNome(), p.getClass().getSimpleName(), estoqueProdutos.get(p));

                System.out.println(mensagem);
                break;
            }
        }

        if (!produtoEncontrado) {
            produto.setCodigo(codigo++);
            estoqueProdutos.put(produto, quantidade);

            String mensagem = """
            Novo produto adicionado ao estoque.
            Código do produto: %d
            Nome do produto: %s
            Tipo do produto: %s
            Quantidade do produto: %d
            """.formatted(produto.getCodigo(), produto.getNome(), produto.getClass().getSimpleName(), quantidade);

            System.out.println(mensagem);
        }
    }

    public void removerProduto(Produto produto, int quantidade) {
        boolean produtoEncontrado = false;

        for (Produto p : estoqueProdutos.keySet()) {
            if (p.getNome().equals(produto.getNome())) {
                int novaQuantidade = Math.max(0, estoqueProdutos.get(p) - quantidade);
                estoqueProdutos.put(p, novaQuantidade);
                produtoEncontrado = true;

                String mensagem = """
                Estoque do produto atualizado.
                Código do produto: %d
                Nome do produto: %s
                Tipo do produto: %s
                Quantidade restante: %d
                """.formatted(p.getCodigo(), p.getNome(), p.getClass().getSimpleName(), novaQuantidade);

                System.out.println(mensagem);
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado no estoque.");
        }
    }
}
