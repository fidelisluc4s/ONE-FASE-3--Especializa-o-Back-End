import br.com.alura.desafiominhascompras.CartaoCredito;
import br.com.alura.desafiominhascompras.Compras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limite);

        int opcaoEscolhida = 0;
        double valor = 0;
        while (opcaoEscolhida != 2) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            valor = leitura.nextDouble();

            Compras compra = new Compras(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso! ");
                System.out.println("""
                        Digite 1 para continuar
                        Digite 2 para sair """);
                opcaoEscolhida = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente! ");
                opcaoEscolhida = 2;
            }
        }

        System.out.println("#####################");
        System.out.println("Compras realizadas \n");
        Collections.sort(cartao.getCompras());
        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getItemCompra() + " - " + c.getValorCompra());
        }

        System.out.println("\n#####################");
        System.out.println("\n Saldo da conta: " + cartao.getSaldo());

    }
}