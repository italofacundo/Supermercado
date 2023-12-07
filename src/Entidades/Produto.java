package Entidades;

import java.util.ArrayList;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected String codigo;

    public Produto(String nome, double preco, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public abstract ArrayList getCategorias();
}
