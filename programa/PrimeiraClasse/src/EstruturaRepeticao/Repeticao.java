package EstruturaRepeticao;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
//        Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
//        "Número positivo", caso contrário, exiba "Número negativo".
            Scanner leitura = new Scanner(System.in);

            System.out.println("Informe um número");
            int numero = leitura.nextInt();

            if (numero % 2 == 0){
                System.out.println("Esse numero é par");
            }else {
                System.out.println("Esse numero é impar");
            }

        //        /Crie um programa que solicite ao usuário a entrada de um número inteiro.
        //        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

//            System.out.println("Informe dois número inteiros");
//            int numero1 = leitura.nextInt();
//            int numero2 = leitura.nextInt();
//
//            if (numero1 == numero2){
//                System.out.println("São iguais");
//            } else if (numero1 != numero2) {
//                System.out.println("Número são diferentes");
//                if (numero1 > numero2){
//                    System.out.println("Número 1 é maior que número 2");
//                }else {
//                    System.out.println("Número 2 é maior que número 1");
//                }
//            }

        //        Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        //        Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

//            System.out.println("Menu de Operações");
//
//            System.out.println("Escolha 1 para -Calcular área do quadrado- e 2 -Calcular área do circulo- ");
//            int numeroEscolhido = leitura.nextInt();
//
//            switch (numeroEscolhido){
//                case 1:
//                    System.out.println("Digite o valor do lado do quadrado");
//                    double lado = leitura.nextDouble();
//                    double areQuadrado = lado * lado;
//                    System.out.println("A área do quadrado é: "+areQuadrado);
//                    break;
//
//                case 2:
//                    System.out.println("Digite o valor do raio do circulo");
//                    double raio = leitura.nextDouble();
//                    double areCirculo = Math.PI * Math.pow(raio, 2);
//                    System.out.println(String.format("A área do circulo é: %.2f ", areCirculo));
//                    break;
//
//                default:
//                    System.out.println("Só pode ser digitado 1 ou 2");
//                    }


        //Crie um programa que solicite ao usuário um
        // número e exiba a tabuada desse número de 1 a 10.

//        System.out.println("Vamos fazer a tabuada");
//
//        System.out.println("Qual número você quer de 1 a 10");
//        int numeroTabuada = leitura.nextInt();
//
//        System.out.println("Numéro escolhido é: "+numeroTabuada);
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(+i+" * "+numeroTabuada+" = "+numeroTabuada * i);
//        }

//        Crie um programa que solicite ao usuário digitar um número.
//        Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

//        System.out.println("Informe um numero");
//            int numeroEscolha = leitura.nextInt();
//
//            if (numeroEscolha >= 0){
//                System.out.println("Numéro positivo");
//        }else {
//                System.out.println("Numero negativo");
//            }

//        Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        System.out.println("Escolha um número para calcular seu fatorial");
            int numeroA = leitura.nextInt();
            double fatorial = 1;

            for (int i = 1 ; i <= numeroA; i++ ){
                fatorial *= i;
            }

        System.out.println("O fatorial de " +numeroA + " é: "+fatorial);
        }

    }

