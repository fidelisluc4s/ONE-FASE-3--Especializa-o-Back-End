import models.Produto;
import models.Servico;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.valorFinal(50,5);

        Servico servico01 = new Servico();
        servico01.valorFinal(10, 35);
    }
}