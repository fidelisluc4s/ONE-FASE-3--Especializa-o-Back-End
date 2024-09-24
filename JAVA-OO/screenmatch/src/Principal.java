public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso Chefão";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDeAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(String.format("%.2f",meuFilme.retornarMedia()));
    }
}
