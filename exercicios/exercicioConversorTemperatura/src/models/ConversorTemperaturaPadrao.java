package models;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(int celsius) {
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.println(String.format("Celsius para Fahrenheit:%.2f ",fahrenheit));
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(String.format("Fahrenheit para Celsius: %.0f ",celsius));
    }
}
