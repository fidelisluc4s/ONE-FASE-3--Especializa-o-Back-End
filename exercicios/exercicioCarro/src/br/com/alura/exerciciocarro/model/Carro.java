package br.com.alura.exerciciocarro.model;

import java.time.LocalDate;

public class Carro {

//    Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
//    Implemente métodos para definir o nome do modelo, os preços médios para cada ano
//    , e calcular e exibir o menor e o maior preço.
//    Adicione uma subclasse ModeloCarro para criar instâncias específicas,
//    utilizando-a na classe principal para definir preços e mostrar informações.

    private String modeloEspecifico;
    private double preco;
    private double preco1;
    private double preco2;
    private double preco3;


    public double precoMedioAno(){
        return preco = ( preco1 + preco2 + preco3 ) / 3;
    }

    public void modeloMaisCaro(){

    }

    public Carro(String modeloEspecifico, double preco1, double preco2, double preco3) {
        this.modeloEspecifico = modeloEspecifico;
        this.preco = preco;
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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
