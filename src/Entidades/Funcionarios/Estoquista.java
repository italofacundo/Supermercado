package Entidades.Funcionarios;

import Entidades.ControleEstoque;
import Entidades.Funcionario;
import Entidades.LeitorDeProdutos;
import Entidades.Produto;
import Entidades.Repositorios.Estoque;

import java.util.List;

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

    @Override
    public void carregarProdutos(Estoque estoque, String arquivo) {
        List<Produto> produtos = LeitorDeProdutos.lerProdutos(arquivo);
        for (Produto produto : produtos) {
            estoque.adicionarProduto(produto, produto.getQuantidade());
        }
    }

    @Override
    public String toString() {
        return "Estoquista{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
