package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

public class Utensilio extends ProdutoNaoAlimenticio {
    String material;

    public Utensilio (String nome, double preco, int quantidade, String material) {
        super(nome, preco, quantidade);
        this.material = material;
    }
}
