package models;

public class ConversouMoeda implements ConversaoFinanceira{

    private double real = 5.49;


    @Override
    public double converterDolarParaReal(double dolar) {

        return dolar * real;
    }
}
