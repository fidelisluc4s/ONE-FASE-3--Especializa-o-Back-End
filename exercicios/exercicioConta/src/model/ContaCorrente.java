package model;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal = 2.0;

    public double cobrarTarifaMensal(){

        return saldo -= tarifaMensal;
    }
}
