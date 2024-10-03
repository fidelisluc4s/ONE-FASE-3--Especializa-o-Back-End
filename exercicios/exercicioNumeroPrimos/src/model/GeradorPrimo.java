package model;

public class GeradorPrimo extends NumeroPrimos{


    public int geradorProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }
}
