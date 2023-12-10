package Entidades;

import Entidades.Repositorios.Estoque;

public interface ControleVendas {
    void iniciarVenda(Estoque estoque);
    void adicionarProdutoVenda(Produto produto, int quantidade);
    void concluirVenda();
}
