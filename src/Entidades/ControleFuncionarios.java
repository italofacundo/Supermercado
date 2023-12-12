package Entidades;

import Entidades.Funcionario;
import Entidades.Repositorios.FuncionarioRepositorio;

public interface ControleFuncionarios {
    void contratarFuncionario(FuncionarioRepositorio repositorio, Funcionario funcionario);
    void demitirFuncionario(FuncionarioRepositorio repositorio, int id);
}
