package models;

public class ProdutoFisico implements Calculavel{

    private double taxaProdutoFisico = 9;
    private boolean desconto = true;

    public void setDesconto(boolean desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal(double valorProduto) {

        if (desconto == true){
            return valorProduto += ((valorProduto * taxaProdutoFisico) * 0.10) / 100;
        }else {
            System.out.println("entrou nesse");
            return valorProduto += (valorProduto * taxaProdutoFisico) / 100;
        }
    }
}
