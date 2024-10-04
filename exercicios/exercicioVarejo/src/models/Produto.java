package models;

public class Produto implements Vendavel {


    @Override
    public void valorFinal(int quantidade, double preco) {
        if (quantidade >= 50){
            double desconto = preco * 0.05;
            System.out.println("Valor do desconto por produto: "+desconto);
            preco = (preco * quantidade) - desconto;
            System.out.println("Valor do produto com desconto: "+ preco);
        }else{
            preco *= quantidade;
            System.out.println("Valor sem desconto: "+preco);
        }
    }
}
