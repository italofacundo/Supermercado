package Entidades.Produtos;

import Entidades.Produto;

public abstract class ProdutoNaoAlimenticio extends Produto {
    public ProdutoNaoAlimenticio(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public String toString() {
        return "ProdutoNaoAlimenticio{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                '}';
    }
}
