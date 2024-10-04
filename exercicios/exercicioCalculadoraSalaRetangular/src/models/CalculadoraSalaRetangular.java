package models;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = (altura * largura) / 2 ;
        System.out.println("A área: "+area);
    }

    @Override
    public void calcularPerimetro(double lado) {
        double perimetro = lado * 3;
        System.out.println("O perimetro: "+perimetro);
    }
}
