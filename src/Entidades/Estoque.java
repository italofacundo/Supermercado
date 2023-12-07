package Entidades;

import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> estoqueProdutos;

    public Estoque(Map<Produto, Integer> estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public void adicionarProduto(String codigo, int quantidade) {
        
    }

    @Override
    public void removerProduto(String codigo, int quantidade) {

    }

    @Override
    public void consultarEstoqueProduto(String codigo, int quantidade) {

    }
}
