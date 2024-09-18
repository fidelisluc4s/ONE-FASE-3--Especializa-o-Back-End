public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        int resultado = soma.soma(soma.n1, soma.n2);
        System.out.println("O resultado da soma é: " + resultado);

        Subtracao subtracao = new Subtracao();
        int resultadoS = subtracao.subtracao(subtracao.n1, subtracao.n2);
        System.out.println("O resultado da subtração é: " + resultadoS);

        //coverta a temperatura
        double celsius  = 27;
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit é: "+(int)fahrenheit);

        //media de duas notas
        double nota1 = 8.1;
        double nota2 = 9.8;

        System.out.println("Média é: " + ((nota1 + nota2)/2));

        //Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.

        double tipoDouble = 5.5;
        int tipoInt = 5;

        int castingVariavel = (int)tipoDouble + tipoInt;

        System.out.println(castingVariavel);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String
        // (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = 'F';
        String palavra = "amilia";

        System.out.println(letra+palavra);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade
        // e apresente o resultado em uma mensagem.

        double precoProduto = 2.99;
        int quantidade = 10;
        double valorTo = precoProduto * quantidade;

        System.out.println(String.format("Valor total %.2f ",valorTo));

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em
        // dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 10;
        double taxa = 4.94;
        double valorEmReais = valorEmDolares * taxa;

        System.out.println(String.format("Valor do Reais: %.2f .E o valor é Dolar: %.2f ", valorEmReais , valorEmDolares));

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o
        // preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um
        // valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
        // aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 299.99;
        double percentualDesconto = 10.0;
        double valorDoDesconto = (precoOriginal * percentualDesconto) / 100;
        double novoPreco = precoOriginal - valorDoDesconto;

        System.out.println("Preço original: "+precoOriginal);
        System.out.println(String.format("Novo valor com desconto: %.2f ", valorDoDesconto));
        System.out.println(String.format("Novo valor:%.2f",novoPreco));


    }

}