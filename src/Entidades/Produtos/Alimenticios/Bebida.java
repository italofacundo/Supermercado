package Entidades.Produtos.Alimenticios;

import Entidades.Produtos.ProdutoAlimenticio;

import java.util.Date;

public class Bebida extends ProdutoAlimenticio {
    protected boolean ehAlcoolica;

    public Bebida(String nome, double preco, int quantidade, Date dataValidade, String unidadeMedida, boolean ehAlcoolica) {
        super(nome, preco, quantidade, dataValidade, unidadeMedida);
        this.ehAlcoolica = ehAlcoolica;
    }
}
