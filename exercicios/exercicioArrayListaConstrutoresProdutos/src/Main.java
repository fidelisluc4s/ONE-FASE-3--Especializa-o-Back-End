import br.com.alura.exercicioarrayconstrutoresprodutos.calculos.models.Produto;
import br.com.alura.exercicioarrayconstrutoresprodutos.calculos.models.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("coca", 8.00,20);
        Produto produto2 = new Produto("cerveja", 9.00,60);
        Produto produto3 = new Produto("picanha", 100.00,10);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Tamanho da lista: "+produtos.size());
        System.out.println("Produto 1: "+produtos.get(0).getNome());
        System.out.println("Produto 2: "+produtos.get(1).getNome());
        System.out.println("Produto 3: "+produtos.get(2).getNome());
        for (Produto produto : produtos){
            System.out.println(produto);
        }

        ProdutoPerecivel validade1 = new ProdutoPerecivel("coca-cola",8.00, 12, "11-12-2024");
        ProdutoPerecivel validade2 = new ProdutoPerecivel("guarana",8.00, 12, "11-12-2025");

        System.out.println("Validade: " +validade1);
    }
}