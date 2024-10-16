package br.com.alura.desafiominhascompras;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double saldo;
    private double limite;
    private List<Compras> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compra){
        if (this.saldo > compra.getValorCompra()){
            this.saldo -= compra.getValorCompra();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
