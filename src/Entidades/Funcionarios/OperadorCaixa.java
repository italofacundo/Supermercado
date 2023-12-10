package Entidades.Funcionarios;

import Entidades.*;

public class OperadorCaixa extends Funcionario implements ControleVendas {
    public OperadorCaixa(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void vender() {

    }

    @Override
    public void cancelarVenda() {

    }

    @Override
    public void emitirRecibo() {

    }
}
