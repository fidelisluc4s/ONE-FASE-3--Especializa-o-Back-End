package br.com.alura.exercicioordenarstring;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + getNome() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }
}
