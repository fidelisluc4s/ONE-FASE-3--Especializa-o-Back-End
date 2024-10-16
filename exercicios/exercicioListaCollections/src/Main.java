import br.com.alura.exercicioestruturadedados.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Numeros numero1 = new Numeros(5);
        Numeros numero2 = new Numeros(1);
        Numeros numero3 = new Numeros(10);
        Numeros numero4 = new Numeros(9);
        Numeros numero5 = new Numeros(4);

        List addNumero = new ArrayList();
        addNumero.add(numero1);
        addNumero.add(numero2);
        addNumero.add(numero3);
        addNumero.add(numero4);
        addNumero.add(numero5);

        System.out.println(addNumero);

        addNumero.sort(Comparator.comparing(Numeros::getNumero));
        System.out.println("Ordenado por menor a maior: \n");
        System.out.println(addNumero);

    }
}