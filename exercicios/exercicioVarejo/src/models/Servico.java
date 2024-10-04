package models;

public class Servico implements Vendavel{
    @Override
    public void valorFinal(int quantidadeDeHoras, double precoHora) {
        double desconto = precoHora * 0.10;
        System.out.println("Valor do Desconto do salário bruto: "+desconto);
        System.out.println("Valor do salário com desconto: "+(quantidadeDeHoras * precoHora - desconto));
    }
}
