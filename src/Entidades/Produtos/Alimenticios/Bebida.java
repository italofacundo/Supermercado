package Entidades.Produtos.Alimenticios;

import Entidades.Produtos.ProdutoAlimenticio;

import java.util.Date;

public class Bebida extends ProdutoAlimenticio {
    protected boolean ehAlcoolico;

    public Bebida(String nome, double preco, Date dataValidade, String unidadeMedida, boolean ehAlcoolico) {
        super(nome, preco, dataValidade, unidadeMedida);
        this.ehAlcoolico = ehAlcoolico;
    }
}
