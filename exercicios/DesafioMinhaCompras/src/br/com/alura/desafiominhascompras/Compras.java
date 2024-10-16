package br.com.alura.desafiominhascompras;

public class Compras implements Comparable<Compras>{
    private String itemCompra;
    private double valorCompra;

    public Compras(String itemCompra, double valorCompra) {
        this.itemCompra = itemCompra;
        this.valorCompra = valorCompra;
    }

    public String getItemCompra() {
        return itemCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public String toString() {
        return "Compras: descrição = " + itemCompra + " valorCompra = " + valorCompra;
    }

    @Override
    public int compareTo(Compras o) {
        return Double.valueOf(this.valorCompra).compareTo(Double.valueOf(o.valorCompra));
    }
}
