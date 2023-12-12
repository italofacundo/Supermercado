package Entidades.Produtos.Alimenticios;

import Entidades.Produtos.ProdutoAlimenticio;

import java.util.Date;

public class Bebida extends ProdutoAlimenticio {
    private boolean ehAlcoolica;

    public Bebida(String nome, double preco, int quantidade, Date dataValidade, String unidadeMedida, boolean ehAlcoolica) {
        super(nome, preco, quantidade, dataValidade, unidadeMedida);
        this.ehAlcoolica = ehAlcoolica;
    }

    public boolean isEhAlcoolica() {
        return ehAlcoolica;
    }

    public void setEhAlcoolica(boolean ehAlcoolica) {
        this.ehAlcoolica = ehAlcoolica;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "ehAlcoolica=" + ehAlcoolica +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                ", dataValidade=" + dataValidade +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                '}';
    }
}
