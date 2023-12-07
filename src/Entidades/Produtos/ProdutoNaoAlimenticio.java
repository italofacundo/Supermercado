package Entidades.Produtos;

import Entidades.Produto;

import java.util.ArrayList;

public abstract class ProdutoNaoAlimenticio extends Produto {

    public ProdutoNaoAlimenticio(String nome, double preco, String codigo) {
        super(nome, preco, codigo);
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = new ArrayList<>();
        categorias.add("Não Alimentício");
        return categorias;
    }

}
