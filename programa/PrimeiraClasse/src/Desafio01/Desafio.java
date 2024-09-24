package Desafio01;

import java.util.Scanner;

public class Desafio {


    public static void main(String[] args) {

        String nome = "Lucas Fidelis";
        String tipoConta = "Poupança";
        double saldo = 2000.00;
        int opcaoEscolhida = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("#############################################");
        System.out.println("\nNome:           "+nome);
        System.out.println("Tipo conta:     "+tipoConta);
        System.out.println("Saldo Inicial:  "+saldo);
        System.out.println("\n#############################################");

        String menu = """
                -- Operações --
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        while (opcaoEscolhida != 4){
            System.out.println(menu);
            opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida){
                case 1:
                    System.out.println("Seu saldo é: "+saldo+"\n");
                    break;
                case 2:
                    System.out.println("Qual valor vc deseja retirar ? ");
                    double saldoRetirado = leitura.nextDouble();
                    if (saldoRetirado > saldo){
                        System.out.println("Esse valor não pode ser retirado.");
                    }else {
                        saldo -= saldoRetirado;
                        System.out.println("Novo saldo é: "+saldo+"\n");
                    }
                    break;
                case 3:
                    System.out.println("Qual valor vc deseja transferir ? ");
                    double valorDepositado = leitura.nextDouble();
                    saldo += valorDepositado;
                    System.out.println(saldo+"\n");
                    break;
                case 4:
                    System.out.println("Até logo!!!");
                    break;
                default:
                    System.out.println("Opção digitada inválida");
            }
        }
    }
}
