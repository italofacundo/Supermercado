package Entidades.Produtos;

import Entidades.Produto;

import java.util.ArrayList;
import java.util.Date;

public abstract class ProdutoAlimenticio extends Produto {
    protected Date dataValidade;
    protected String unidadeMedida;

    public ProdutoAlimenticio(String nome, double preco, String codigo, Date dataValidade, String unidadeMedida) {
        super(nome, preco, codigo);
        this.dataValidade = dataValidade;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = new ArrayList<>();
        categorias.add("Alimentício");
        return categorias;
    }
}
