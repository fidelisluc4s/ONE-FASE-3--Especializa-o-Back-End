import model.ContaBancaria;
import model.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        ContaCorrente conta2 = new ContaCorrente();

        conta1.setNome("Lucas");
        conta1.depositar(2000);
        System.out.println(conta1.consultarSaldo());
        conta1.sacarConta(1000);
        System.out.println(conta1.consultarSaldo());

        conta2.setNome("lucas");
        conta2.depositar(3000);
        System.out.println("\nConta do(a): "+conta2.getNome()+"\nSaldo disponível: " +conta2.consultarSaldo());
        conta2.cobrarTarifaMensal();
        System.out.println("\nConta do(a): "+conta2.getNome()+"\nSaldo disponível: " +conta2.consultarSaldo());

    }
}