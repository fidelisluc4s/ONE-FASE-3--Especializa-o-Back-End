import model.GeradorPrimo;
import model.NumeroPrimos;
import model.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {

        VerificadorPrimo verificador = new VerificadorPrimo();
        System.out.println("Verificador de se é primo: "+verificador.verificarPrimalidade(18));

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.geradorProximoPrimo(7);
        System.out.println("O próximo primo após 17 é: "+ proximoPrimo);

        NumeroPrimos numerosPrimos = new NumeroPrimos();
        numerosPrimos.listarPrimos(30);

    }
}