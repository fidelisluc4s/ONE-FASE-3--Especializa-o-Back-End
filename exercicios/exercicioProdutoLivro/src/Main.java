import models.Livro;
import models.ProdutoFisico;

public class Main {
    public static void main(String[] args) {

        ProdutoFisico produto1 = new ProdutoFisico();
        produto1.setDesconto(true);
        System.out.println(produto1.calcularPrecoFinal(35));

        Livro produto2 = new Livro();
        System.out.println(produto2.calcularPrecoFinal(35));
    }
}