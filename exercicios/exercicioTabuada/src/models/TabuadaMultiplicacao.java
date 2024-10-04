package models;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        if (numero <= 0){
            System.out.println("Numero menor ou igual a zero");
        }
        for (int i = 1; i <= 10; i++){
            System.out.println(i+"X"+numero+"="+i * numero);
        }

    }
}
