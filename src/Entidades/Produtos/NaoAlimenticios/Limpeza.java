package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

public class Limpeza extends ProdutoNaoAlimenticio {
    String localUso;

    public Limpeza(String nome, double preco, int quantidade, String localUso) {
        super(nome, preco, quantidade);
        this.localUso = localUso;
    }
}
