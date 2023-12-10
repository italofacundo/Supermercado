package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

import java.util.ArrayList;

public class Eletronico extends ProdutoNaoAlimenticio {
    int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidade, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }
}
