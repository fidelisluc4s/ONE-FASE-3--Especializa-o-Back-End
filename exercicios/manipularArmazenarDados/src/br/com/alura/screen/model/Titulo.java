package br.com.alura.screen.model;

public class Titulo {

    private String nomeTitulo;
    private int anoLancamento;

    public Titulo(String nomeTitulo, int anoLancamento) {
        this.nomeTitulo = nomeTitulo;
        this.anoLancamento = anoLancamento;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


}
