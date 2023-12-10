package Entidades;

public interface ControleEstoque {
    void adicionarProduto(Produto produto, int quantidade);
    void removerProduto(Produto produto, int quantidade);
    void consultarEstoque();
    void consultarEstoque(String nome);
}
