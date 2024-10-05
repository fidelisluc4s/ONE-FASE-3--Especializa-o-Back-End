import models.Animal;
import models.Cachorro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Java");
        listaString.add("JavaScript");
        listaString.add("C#");

        for (String elemento : listaString){
            System.out.println(elemento);
        }

        Animal animal = new Cachorro("Lup",5);
        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }else {
            System.out.println("O objeto não é um Chachorro. ");
        }

    }
}