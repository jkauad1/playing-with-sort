package atividade00;

public class Pessoa implements Comparable<Pessoa> {
    private int idade;
    private long cpf;
    private String nome;

    public Pessoa(int idade, long cpf, String nome) {
        this.idade = idade;
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome+"["+idade+"]"+"("+cpf+")";
    }

    @Override
    public int compareTo(Pessoa outra) {
//    	if (this.idade != outra.idade) {
//    		return Integer.compare(this.idade, outra.idade);
//    	} else if (!this.nome.equals(outra.nome)) {
//    		return this.nome.compareTo(outra.nome); 
//    	}   else {
//    		return Long.compare(this.cpf, outra.cpf);
//    	}
//        return Long.compare(this.cpf, outra.cpf);
        return Integer.compare(this.idade, outra.idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}