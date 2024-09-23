import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao jogo de adivinhação, escolha um numero de 0 a 100");

        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int numeroTentativa = 0;
        
        System.out.println("JOgo de adivinhação, escolha um número de 0 a 100.");
        System.out.println(numeroAleatorio);
        while (numeroTentativa < 5){
            System.out.println("Informe um numero");
            int numero = leitura.nextInt();
            numeroTentativa++;

            if (numero == numeroAleatorio){
                System.out.println("Seu número da sorte é: " + numeroAleatorio + " seu numero de tentativas foram "+numeroTentativa);
                break;
            } else if (numeroAleatorio > numero) {
                System.out.println("Seu numero é maior q o numero aleatório ");
            } else{
                System.out.println("Seu numero é menor q o numero aleatório ");
            }
            System.out.println("Tentantivas restantes: " + (5 - numeroTentativa));
        }


    }
}
