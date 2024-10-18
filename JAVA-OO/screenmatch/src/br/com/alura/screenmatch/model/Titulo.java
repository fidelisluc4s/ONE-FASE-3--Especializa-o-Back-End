package br.com.alura.screenmatch.model;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    @SerializedName("Title")
    private String nome;

    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDeAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public double getSomaDeAvaliacoes(){
        return somaDeAvaliacoes;
    }
    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Tempo do filme: "+duracaoEmMinutos);
    }
    public void avalia(double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double retornarMedia(){
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo" +
                "nome = '" + nome + ", anoDeLancamento = " + anoDeLancamento +
                ", duração = " +duracaoEmMinutos;
    }
}
