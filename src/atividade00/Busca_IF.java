package atividade00;

public interface Busca_IF {
    Pessoa buscaLinearIterativa(Pessoa[] pessoas, int idade) throws IdadeNegativaException;
    Pessoa buscaLinearRecursiva(Pessoa[] pessoas, int idade) throws IdadeNegativaException;
    Pessoa buscaBinariaIterativa(Pessoa[] pessoas, int idade) throws IdadeNegativaException;
    Pessoa buscaBinariaRecursiva(Pessoa[] pessoas, int idade) throws IdadeNegativaException;
}