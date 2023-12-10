package Entidades.Funcionarios;

import Entidades.ControleEstoque;
import Entidades.Funcionario;
import Entidades.Produto;

public class Estoquista extends Funcionario implements ControleEstoque {
    public Estoquista(String nome, double salario, String id) {
        super(nome, salario);
    }

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {

    }

    @Override
    public void removerProduto(Produto produto, int quantidade) {

    }

    @Override
    public void consultarEstoque() {

    }

    @Override
    public void consultarEstoque(String nome) {

    }
}
