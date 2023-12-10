package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

import java.util.ArrayList;

public class Eletronico extends ProdutoNaoAlimenticio {
    int garantiaMeses;

    public Eletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }
}
