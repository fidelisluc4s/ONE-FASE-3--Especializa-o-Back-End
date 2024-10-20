import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero1 = leitura.nextInt();

        System.out.println("Informe outro número maior q zero");
        int numero2 = leitura.nextInt();

        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado divisao: " + resultado);
        }catch (ArithmeticException a){
            System.out.println("Erro: Não pode ter divisão com zero");
        }

    }
}