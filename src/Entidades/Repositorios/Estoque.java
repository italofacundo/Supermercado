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
        if (estoqueProdutos.containsKey(produto)) {
            estoqueProdutos.put(produto, estoqueProdutos.get(produto) + quantidade);

            String mensagem = """
            Estoque do produto atualizado.
            Código do produto: %d
            Nome do produto: %s
            Tipo do produto: %s
            Quantidade do produto: %d
            """.formatted(produto.getCodigo(), produto.getNome(), produto.getClass().getSimpleName(), estoqueProdutos.get(produto));
            System.out.println(mensagem);

            return;
        }

        estoqueProdutos.put(produto, quantidade);
        produto.setCodigo(codigo++);

        String mensagem = """
        Produto adicionado ao estoque.
        Código do produto: %d
        Nome do produto: %s
        Tipo do produto: %s
        Quantidade do produto: %d
        """.formatted(produto.getCodigo(), produto.getNome(), produto.getClass().getSimpleName(), quantidade);
        System.out.println(mensagem);
    }

    public void removerProduto(Produto produto, int quantidade) {
        if (!estoqueProdutos.containsKey(produto)) {
            System.out.println("Produto não encontrado no estoque.");
            return;
        }

        // TRANSFORMAR ISSO AQUI EM UMA EXCEÇÃO DEPOIS
        if (estoqueProdutos.get(produto) < quantidade) {
            System.out.println("Quantidade de produtos insuficiente no estoque.");
            return;
        }

        estoqueProdutos.put(produto, estoqueProdutos.get(produto) - quantidade);

        String mensagem = """
        Estoque do produto atualizado.
        Código do produto: %d
        Nome do produto: %s
        Tipo do produto: %s
        Quantidade do produto: %d
        """.formatted(produto.getCodigo(), produto.getNome(), produto.getClass().getSimpleName(), estoqueProdutos.get(produto));
        System.out.println(mensagem);
    }
}
