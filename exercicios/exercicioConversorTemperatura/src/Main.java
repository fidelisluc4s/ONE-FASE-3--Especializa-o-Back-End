import models.ConversorTemperatura;
import models.ConversorTemperaturaPadrao;

public class Main {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.celsiusParaFahrenheit(32);
        temperatura.fahrenheitParaCelsius(89.6);
    }
}