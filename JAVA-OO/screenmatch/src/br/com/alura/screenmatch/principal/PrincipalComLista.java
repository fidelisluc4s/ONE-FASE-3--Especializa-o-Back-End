package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(5);
        Filme outroFilme = new Filme("Harry Potter",2000);
        outroFilme.avalia(10);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(7);
        Serie serie1 = new Serie("Sobre Natural",2005);
        serie1.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(serie1);

        for (Titulo item: lista){
            System.out.println(item);

            if (item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Addam Sandler");
        buscarPorArtista.add("Natalia");
        buscarPorArtista.add("Lucas");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
    System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);

        System.out.println("Lista de titulos Ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano");
        System.out.println(lista);

    }
}
