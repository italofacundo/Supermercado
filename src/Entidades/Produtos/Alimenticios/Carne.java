package Entidades.Produtos.Alimenticios;

import Entidades.Produtos.ProdutoAlimenticio;

import java.util.Date;

public class Carne extends ProdutoAlimenticio {
    protected String tipoCarne;

    public Carne(String nome, double preco, int quantidade, Date dataValidade, String unidadeMedida, String tipoCarne) {
        super(nome, preco, quantidade, dataValidade, unidadeMedida);
        this.tipoCarne = tipoCarne;
    }
}
