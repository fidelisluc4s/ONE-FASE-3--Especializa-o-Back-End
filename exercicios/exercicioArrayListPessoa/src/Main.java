import models.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var pessoa1 = new Pessoa("Lucas",32);
        var pessoa2 = new Pessoa("Ana",31);
        var pessoa3 = new Pessoa("Antonio",30);

        ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);

        System.out.println("Tamanho da lista: "+listaPessoa.size());
        System.out.println("Ultima pessoa da lista: "+listaPessoa.get(0).getNome());
        System.out.println("Lista 1 Pessoas: \n"+listaPessoa);
        System.out.println("\nLista 2 Pessoas: ");
        for (Pessoa pessoa: listaPessoa){
            System.out.println(pessoa);
        }
    }
}