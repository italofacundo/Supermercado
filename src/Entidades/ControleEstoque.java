package Entidades;

import Entidades.Repositorios.Estoque;

public interface ControleEstoque {
    void adicionarProduto(Estoque estoque, Produto produto, int quantidade);
    void removerProduto(Estoque estoque, Produto produto, int quantidade);
    void consultarEstoque(Estoque estoque);
    void consultarEstoque(Estoque estoque, String nome);
    void carregarProdutos(Estoque estoque, String arquivo);
}
