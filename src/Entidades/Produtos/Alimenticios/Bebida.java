package Entidades.Produtos.Alimenticios;

import Entidades.Produtos.ProdutoAlimenticio;

import java.util.ArrayList;
import java.util.Date;

public class Bebida extends ProdutoAlimenticio {
    protected String tipoBebida;

    public Bebida(String nome, double preco, String codigo, Date dataValidade, String unidadeMedida, String tipoBebida) {
        super(nome, preco, codigo, dataValidade, unidadeMedida);
        this.tipoBebida = tipoBebida;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categorias = super.getCategorias();
        categorias.add("Bebida");
        return categorias;
    }
}
