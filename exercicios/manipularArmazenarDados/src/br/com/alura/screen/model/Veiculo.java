package br.com.alura.screen.model;

public class Veiculo {

    private String nomeVeiculo;
    private int ano;
    private String cor;

    public Veiculo(String nomeVeiculo, int ano, String cor) {
        this.nomeVeiculo = nomeVeiculo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Veiculo = {\n" +
                "nomeVeiculo = " + nomeVeiculo +
                ", \nano = " + ano +
                ", \ncor = " + cor +
                "\n}";
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
