package model;

public class ContaBancaria {

    private String nome;
    protected double saldo;
    private double deposito;
    private double sacar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double depositar(double deposito){
        return saldo += deposito;
    }

    public double sacarConta(double sacarV){
        return saldo -= sacarV;
    }

}
