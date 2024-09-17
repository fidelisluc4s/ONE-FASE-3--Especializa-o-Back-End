public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        int resultado = soma.soma(soma.n1, soma.n2);
        System.out.println("O resultado da soma é: " + resultado);

        Subtracao subtracao = new Subtracao();
        int resultadoS = subtracao.subtracao(subtracao.n1, subtracao.n2);
        System.out.println("O resultado da subtração é: " + resultadoS);
    }

}