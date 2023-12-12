package Entidades.Funcionarios;

import Entidades.*;
import Entidades.Repositorios.Estoque;

public class OperadorCaixa extends Funcionario implements ControleVendas {
    private Venda vendaAtual;

    public OperadorCaixa(String nome, double salario) {
        super(nome, salario);
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

    public void adicionarProdutoVenda(String nomeProduto, int quantidade, Estoque estoque) {
        if (vendaAtual == null) {
            System.out.println("Nenhuma venda iniciada.");
            return;
        }
        Produto produto = estoque.getProduto(nomeProduto);
        if (produto != null) {
            vendaAtual.adicionarProduto(produto, quantidade);
        } else {
            System.out.println("Produto não encontrado: " + nomeProduto);
        }
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
        return "OperadorCaixa{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
