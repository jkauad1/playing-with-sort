package atividade00;

import java.util.Arrays;
import atividade00.Pessoa;
public class BrincandoComBusca {

    public static void main(String[] args) {
        Pessoa[] pessoas = {
                new Pessoa(29, 11122233344L, "João"),
                new Pessoa(30, 44455566677L, "Maria"),
                new Pessoa(20, 77788899900L, "Pedro"),
                new Pessoa(22, 22200044466L, "Ana"),
                new Pessoa(25, 33355577799L, "José")
        };

        // Ordenando o vetor (por idade) para usar busca binária
        Arrays.sort(pessoas); //usando seu compareTo !!!

        System.out.println("Pessoas ordenadas:");
        for (Pessoa p : pessoas) System.out.println(p);

        Busca busca = new Busca();
        Pessoa pessoaEncontrada;
        Pessoa pessoaEncontrada2;
        Pessoa pessoaEncontrada3;

        try {
            pessoaEncontrada = busca.buscaLinearIterativa(pessoas, 25);
            pessoaEncontrada3 = busca.buscaBinariaIterativa(pessoas, 30);
            pessoaEncontrada2 = busca.buscaLinearRecursiva(pessoas, 29, 0);
            //pessoaEncontrada = busca.buscaBinariaRecursiva(pessoas, 25);
            if (pessoaEncontrada != null && pessoaEncontrada2 != null && pessoaEncontrada3 != null) {
                System.out.println("Pessoa encontrada: " + pessoaEncontrada +
                                   "\nPessoa encontrada 2: " + pessoaEncontrada2 +
                                    "\nPessoa encontrada 3: ");
            } else {
                System.out.println("Pessoa não encontrada.");
            }
            //System.out.println(busca.buscaBinariaIterativa(pessoas, 25).equals(busca.buscaBinariaRecursiva(pessoas, 25)));
            //System.out.println(busca.buscaLinearIterativa(pessoas, 25).equals(busca.buscaLinearRecursiva(pessoas, 25, 1)));
        } catch (IdadeNegativaException e) {
            System.err.println(e.getMessage());
        }
    }

}