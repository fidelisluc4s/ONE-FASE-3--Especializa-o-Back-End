import br.com.alura.exerciciocarro.model.Carro;

public class Principal {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setModeloEspecifico("Rural Willys");
        carro1.setPreco1(10000.0);
        carro1.setPreco2(17000.0);
        carro1.setPreco3(16000.0);

        carro2.setModeloEspecifico("Chevrolet Caravan");
        carro2.setPreco1(10000.0);
        carro2.setPreco2(21000.0);
        carro2.setPreco3(22000.0);

        carro1.exibirInformacoes();
        carro1.precoMedioAno();
        System.out.println(carro1.calcularMenorPreco());
        System.out.println(carro1.calcularMaiorPreco());

        carro2.exibirInformacoes();
        carro2.precoMedioAno();




    }
}
