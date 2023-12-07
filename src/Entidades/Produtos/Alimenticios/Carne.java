package Entidades.Produtos.Alimenticios;

import Entidades.Produtos.ProdutoAlimenticio;

import java.util.ArrayList;
import java.util.Date;

public class Carne extends ProdutoAlimenticio {
    protected String tipoCarne;

    public Carne(String nome, double preco, String codigo, Date dataValidade, String unidadeMedida, String tipoCarne) {
        super(nome, preco, codigo, dataValidade, unidadeMedida);
        this.tipoCarne = tipoCarne;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = super.getCategorias();
        categorias.add("Bebida");
        return categorias;
    }
}
