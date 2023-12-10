package Entidades;

import Entidades.Repositorios.Estoque;
import Entidades.Repositorios.FuncionarioRepositorio;
import Entidades.Repositorios.VendasRepositorio;

public interface RelatorioAdministrativo {
    String gerarRelatorioEstoque(Estoque estoque);
    String gerarRelatorioVendas(VendasRepositorio vendasRepositorio);
    String gerarRelatorioFuncionarios(FuncionarioRepositorio funcionarioRepositorio);
}
