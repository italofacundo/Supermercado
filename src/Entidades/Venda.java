package Entidades;

import java.util.Map;

public class Venda {
    private Map<Produto, Integer> produtoQuantidade;

    public void adicionarProduto(Produto produto, int quantidade) {
        produtoQuantidade.put(produto, quantidade);
    }

    public void removerProduto(Produto produto) {
        produtoQuantidade.remove(produto);
    }
}
