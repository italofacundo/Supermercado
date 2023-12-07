package Entidades;

import java.util.Map;

public class Venda {
    private Map<Produto, Integer> produtos;

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, quantidade);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

}
