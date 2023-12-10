package Entidades.Funcionarios;

import Entidades.ControleEstoque;
import Entidades.Funcionario;
import Entidades.Produto;
import Entidades.Repositorios.Estoque;

public class Estoquista extends Funcionario implements ControleEstoque {
    public Estoquista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void adicionarProduto(Estoque estoque, Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    @Override
    public void removerProduto(Estoque estoque, Produto produto, int quantidade) {
        estoque.removerProduto(produto, quantidade);
    }

    @Override
    public void consultarEstoque(Estoque estoque) {
        estoque.consultarEstoque();
    }

    @Override
    public void consultarEstoque(Estoque estoque, String nome) {
        estoque.consultarEstoque(nome);
    }
}
