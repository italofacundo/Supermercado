package Entidades.Repositorios;

import Entidades.Produto;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> estoque;
    private int codigo = 1;

    public Estoque() {
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        boolean novoProduto = true;
        for (Produto p : estoque) {
            if (p.getCodigo() == produto.getCodigo()) {
                p.setQuantidade(p.getQuantidade() + quantidade);
                imprimirMensagem(p, "atualizado");
                novoProduto = false;
                break;
            }
        }

        if (novoProduto) {
            produto.setQuantidade(quantidade);
            produto.setCodigo(codigo++);
            estoque.add(produto);
            imprimirMensagem(produto, "adicionado");
        }
    }

    public void removerProduto(Produto produto, int quantidade) {
        for (Produto p : estoque) {
            if (p.getCodigo() == produto.getCodigo()) {
                if (p.getQuantidade() < quantidade) {
                    System.out.println("Quantidade de produtos insuficiente no estoque.");
                    return;
                }
                p.setQuantidade(p.getQuantidade() - quantidade);
                imprimirMensagem(p, "atualizado");
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }

    private void imprimirMensagem(Produto produto, String operacao) {
        String mensagem = String.format("""
        Produto %s no estoque.
        Código do produto: %d
        Nome do produto: %s
        Tipo do produto: %s
        Quantidade do produto: %d
        """, operacao, produto.getCodigo(), produto.getNome(), produto.getClass().getSimpleName(), produto.getQuantidade());
        System.out.println(mensagem);
    }

    public void consultarEstoque() {
        // IMPLEMENTAR EXCEÇÃO
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }

        for (Produto p : estoque) {
            System.out.println(p.toString());
        }
    }

    public void consultarEstoque(String nome) {
        boolean produtoEncontrado = false;
        for (Produto p : estoque) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println(p.toString());
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto com o nome '" + nome + "' não encontrado no estoque.");
        }
    }

    public boolean consultarDisponibilidade(Produto produto, int quantidade) {
        for (Produto p : estoque) {
            if (p.getCodigo() == produto.getCodigo() && p.getQuantidade() >= quantidade) {
                return true;
            }
        }
        return false;
    }
}
