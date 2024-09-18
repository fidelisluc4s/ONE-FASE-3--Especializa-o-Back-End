
public class Main {
    public static void main(String[] args) {

        System.out.println("Olá Mundo");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilem = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = ("""
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """+anoDeLancamento);
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);


        int contador = 1;
        while (contador <= 10){
            System.out.println(contador);

        }

    }
}