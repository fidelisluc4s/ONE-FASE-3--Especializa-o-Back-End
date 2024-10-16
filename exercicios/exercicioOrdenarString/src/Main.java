import br.com.alura.exercicioordenarstring.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Titulo titulo1 = new Titulo("weasafa");
        Titulo titulo2 = new Titulo("dasdsadsa");
        Titulo titulo3 = new Titulo("fsafasf");
        Titulo titulo4 = new Titulo("adsadsa");
        Titulo titulo5 = new Titulo("hadsada");

        List listaTitulo = new ArrayList();
        listaTitulo.add(titulo1);
        listaTitulo.add(titulo2);
        listaTitulo.add(titulo3);
        listaTitulo.add(titulo4);
        listaTitulo.add(titulo5);

        System.out.println(listaTitulo);

        Collections.sort(listaTitulo);
        System.out.println("Titulo depois de ordenado");
        System.out.println(listaTitulo);

    }
}