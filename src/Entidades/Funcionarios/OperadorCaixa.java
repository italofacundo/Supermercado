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

    @Override
    public void concluirVenda() {
        if (vendaAtual != null) {
            vendaAtual.concluirVenda();
            vendaAtual = null;
        } else {
            System.out.println("Nenhuma venda para concluir.");
        }
    }
}
