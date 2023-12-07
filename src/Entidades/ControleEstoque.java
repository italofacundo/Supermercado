package Entidades;

public interface ControleEstoque {
    void adicionarProduto(String codigo, int quantidade);
    void removerProduto(String codigo, int quantidade);
    void consultarEstoqueProduto(String codigo, int quantidade);
}
