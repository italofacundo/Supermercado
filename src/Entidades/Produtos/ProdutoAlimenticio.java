package Entidades.Produtos;

import Entidades.Produto;

import java.util.ArrayList;
import java.util.Date;

public abstract class ProdutoAlimenticio extends Produto {
    protected Date dataValidade;
    protected String unidadeMedida;

    public ProdutoAlimenticio(String nome, double preco, int quantidade, Date dataValidade, String unidadeMedida) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "ProdutoAlimenticio{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                ", dataValidade=" + dataValidade +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                '}';
    }
}
