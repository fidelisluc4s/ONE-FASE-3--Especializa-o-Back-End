public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso Chefão";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibirFichaTecnica();
    }
}
