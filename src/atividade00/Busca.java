package atividade00;

public class Busca implements Busca_IF {

    @Override
    public Pessoa buscaLinearIterativa(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
        if (idade < 0) {
            throw new IdadeNegativaException("Idade inválida.");
        } else {
            //for (Pessoa pessoa : pessoas) {
            for (int i = 0; i < pessoas.length; i++) {
                if (pessoas[i].getIdade() == idade) {
                    return pessoas[i];
                }
            }
        }
        return null;
    }

    @Override
    public Pessoa buscaBinariaIterativa(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
        if (idade < 0) {
            throw new IdadeNegativaException("Idade inválida.");
        }
        int start = 0;
        int end = (pessoas.length - 1);

        while (start <= end) {
            int half = (end + start) / 2;

            if (pessoas[half].getIdade() == idade) {
                return pessoas[half];
            } else if (pessoas[half].getIdade() > idade) {
                end = half - 1;
            } else {
                start = half + 1;
            }
        }
        return null;
    }

    @Override
    public Pessoa buscaLinearRecursiva(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
        return buscaLinearRecursivaAux(pessoas, idade, 0);
    }
    public Pessoa buscaLinearRecursivaAux(Pessoa[] pessoas, int idade, int indice) throws IdadeNegativaException {
        if (idade < 0) {
            throw new IdadeNegativaException("Idade inválida.");
        }
        if (indice >= pessoas.length) {
            return null;
        }
        if (pessoas[indice].getIdade() == idade) {
            return pessoas[indice];
        }
        return buscaLinearRecursivaAux(pessoas, idade, (indice + 1));
    }

    @Override
    public Pessoa buscaBinariaRecursiva(Pessoa[] pessoas, int idade) throws IdadeNegativaException {
        if (idade < 0) {
            throw new IdadeNegativaException("Idade inválida.");
        }
        return null;
    }
}