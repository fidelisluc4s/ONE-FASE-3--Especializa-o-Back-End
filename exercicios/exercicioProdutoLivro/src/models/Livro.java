package models;

public class Livro implements Calculavel{
    private boolean livroVirtual;
    @Override
    public double calcularPrecoFinal(double valorProduto) {
         return valorProduto -= (valorProduto * 0.10);

    }
}
