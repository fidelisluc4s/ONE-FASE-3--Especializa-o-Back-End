package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4 ){
            System.out.println("Esse filme é bem recomendado");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Esse filme estã sendo bem avaliado no momento");
        }else {
            System.out.println("Salvo esse filme para assistir depois");
        }
    }
}
