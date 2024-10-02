package br.com.alura.exerciciocarro.model;

import java.time.LocalDate;

public class Carro {

//    Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
//    Implemente métodos para definir o nome do modelo, os preços médios para cada ano
//    , e calcular e exibir o menor e o maior preço.
//    Adicione uma subclasse ModeloCarro para criar instâncias específicas,
//    utilizando-a na classe principal para definir preços e mostrar informações.

    private String modeloEspecifico;
    private double preco1;
    private double preco2;
    private double preco3;

    public void definirModelo(String modeloEspecifico){
        this.modeloEspecifico = modeloEspecifico;
    }

    public void exibirInformacoes(){
        System.out.println("""
                Modelo do carro: """ +modeloEspecifico+ """
                \nPreço do primeiro ano: """ +preco1+ """
                \nPreço do segundo ano: """ +preco2+ """
                \nPreço do terçeiro ano: """ +preco3);
    }

    public void precoMedioAno(){
        System.out.println(String.format("Preço médio: %.2f " , ( preco1 + preco2 + preco3 ) / 3 ));
    }

    public double calcularMenorPreco(){
        double menorPreco = preco1;

        if (preco2 < menorPreco){
            menorPreco = preco2;
        }if (preco3 < menorPreco){
            menorPreco = preco3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = preco1;
        if (preco2 > maiorPreco){
            maiorPreco = preco2;
        }
        if (preco3 > maiorPreco){
            maiorPreco = preco3;
        }
        return maiorPreco;
    }

    public String getModeloEspecifico() {
        return modeloEspecifico;
    }

    public void setModeloEspecifico(String modeloEspecifico) {
        this.modeloEspecifico = modeloEspecifico;
    }

    public double getPreco1() {
        return preco1;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public double getPreco3() {
        return preco3;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

}
