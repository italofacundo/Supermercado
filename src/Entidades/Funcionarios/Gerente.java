package Entidades.Funcionarios;


import Entidades.*;
import Entidades.ControleFuncionarios;
import Entidades.Repositorios.Estoque;
import Entidades.Repositorios.FuncionarioRepositorio;
import Entidades.Repositorios.VendasRepositorio;

import java.util.List;

public class Gerente extends Funcionario implements ControleEstoque, ControleFuncionarios, ControleVendas {
    private Venda vendaAtual;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void contratarFuncionario(FuncionarioRepositorio repositorio, Funcionario funcionario) {
        repositorio.contratarFuncionario(funcionario);
    }

    @Override
    public void demitirFuncionario(FuncionarioRepositorio repositorio, int id) {
        repositorio.demitirFuncionario(id);
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
    public void iniciarVenda(Estoque estoque) {
        vendaAtual = new Venda(estoque);
    }

    @Override
    public void adicionarProdutoVenda(Produto produto, int quantidade) {
        if (vendaAtual == null) {
            System.out.println("Nenhuma venda iniciada.");
            return;
        }
        vendaAtual.adicionarProduto(produto, quantidade);
    }

    @Override
    public void concluirVenda() {
        if (vendaAtual != null) {
            vendaAtual.concluirVenda();
            vendaAtual = null;
        } else {
            System.out.println("Nenhuma venda para concluir.");
        }
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
