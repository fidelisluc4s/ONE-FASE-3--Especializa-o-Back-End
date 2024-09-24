public class Principal {
//    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//
//        meuFilme.nome = "O poderoso Chefão";
//        meuFilme.anoDeLancamento = 2017;
//        meuFilme.duracaoEmMinutos = 180;
//
//        meuFilme.exibirFichaTecnica();
//        meuFilme.avalia(8);
//        meuFilme.avalia(7);
//        meuFilme.avalia(10);
//        System.out.println(meuFilme.somaDeAvaliacoes);
//        System.out.println(meuFilme.totalDeAvaliacoes);
//        System.out.println(String.format("%.2f",meuFilme.retornarMedia()));
//    }

//    public static void main(String[] args) {
//
//        Pessoa pessoa1 = new Pessoa();
//        pessoa1.nome = "Lucas";
//        pessoa1.idade = 32;
//        pessoa1.olaMundo();
//    }
//public static void main(String[] args) {
//
//    Calculadora multi = new Calculadora();
//
//    System.out.println(multi.doubloValor(2));
//
//}
public static void main(String[] args) {

    Musica musica1 = new Musica();

    musica1.titulo = "Link Park";
    musica1.artista = "Chester";
    musica1.anoLancamento = 2002;

    musica1.fichaTecnica();
    musica1.avaliar(5);
    musica1.avaliar(3);
    System.out.println(musica1.somaAvaliacao);
    System.out.println(musica1.numAvaliacoes);
    System.out.println(musica1.mediaAvaliacao());
}
}
