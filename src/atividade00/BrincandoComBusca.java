
package atividade00;

import java.util.Arrays;

public class BrincandoComBusca {

    public static void main(String[] args) {
        Pessoa[] pessoas = {
                new Pessoa(25, 11122233344L, "João"),
                new Pessoa(30, 44455566677L, "Maria"),
                new Pessoa(20, 77788899900L, "Pedro"),
                new Pessoa(25, 22200044466L, "Ana"),
                new Pessoa(30, 33355577799L, "José")
        };

        // Ordenando o vetor (por idade) para usar busca binária
        Arrays.sort(pessoas); //usando seu compareTo !!!

        System.out.println("Pessoas ordenadas:");
        for (Pessoa p : pessoas) System.out.println(p);

        Busca_IF busca = new Busca();
        Pessoa pessoaEncontrada;

        try {
            //pessoaEncontrada = busca.buscaLinearIterativa(pessoas, 25);
            //pessoaEncontrada = busca.buscaBinariaIterativa(pessoas, 25);
            //pessoaEncontrada = busca.buscaLinearRecursiva(pessoas, 24);
            pessoaEncontrada = busca.buscaBinariaRecursiva(pessoas, 25);
            if (pessoaEncontrada != null) {
                System.out.println("Pessoa encontrada: " + pessoaEncontrada);
            } else {
                System.out.println("Pessoa não encontrada.");
            }
            //System.out.println(busca.buscaBinariaIterativa(pessoas, 25).equals(busca.buscaBinariaRecursiva(pessoas, 25)));
            //System.out.println(busca.buscaLinearIterativa(pessoas, 25).equals(busca.buscaLinearRecursiva(pessoas, 25)));
        } catch (IdadeNegativaException e) {
            System.err.println(e.getMessage());
        }
    }

}