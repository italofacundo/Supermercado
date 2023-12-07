package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

import java.util.ArrayList;

public class Eletronico extends ProdutoNaoAlimenticio {
    int garantiaMeses;

    public Eletronico(String nome, double preco, String codigo, int garantiaMeses) {
        super(nome, preco, codigo);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = super.getCategorias();
        categorias.add("Eletrônico");
        return categorias;
    }
}
