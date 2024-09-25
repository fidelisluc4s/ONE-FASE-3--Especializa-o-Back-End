import br.com.alura.screenmatch.model.Filme;
import exerciciosJavaOo.model.IdadePessoa;

public class Principal {

//    public static void main(String[] args) {
//
//        exercicios.Calculadora.Pessoa pessoa1 = new exercicios.Calculadora.Pessoa();
//        pessoa1.nome = "Lucas";
//        pessoa1.idade = 32;
//        pessoa1.olaMundo();
//    }
//public static void main(String[] args) {
//
//    exercicios.Calculadora multi = new exercicios.Calculadora();
//
//    System.out.println(multi.doubloValor(2));
//
//}
//public static void main(String[] args) {
//
//    exercicios.Calculadora.Musica musica1 = new exercicios.Calculadora.Musica();
//
//    musica1.titulo = "Link Park";
//    musica1.artista = "Chester";
//    musica1.anoLancamento = 2002;
//
//    musica1.fichaTecnica();
//    musica1.avaliar(5);
//    musica1.avaliar(3);
//    System.out.println(musica1.somaAvaliacao);
//    System.out.println(musica1.numAvaliacoes);
//    System.out.println(musica1.mediaAvaliacao());
//}

//    public static void main(String[] args) {
//        exercicios.Carro carro1 = new exercicios.Carro();
//
//        carro1.modeloCarro = "Corsa";
//        carro1.ano = 2004;
//        carro1.cor = "Vermelho";
//
//        carro1.fichaTecnica();
//
//        System.out.println(carro1.anoCarro(carro1.anoCarro(carro1.ano)));
//
//    }

//    public static void main(String[] args) {
//
//        exercicios.Aluno aluno1 = new exercicios.Aluno();
//
//        aluno1.nome = "Lucas";
//        aluno1.idade = 32;
//
//        aluno1.exibirInformacoes();
//    }

//    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//
//        meuFilme.setNome("O poderoso Chefão");
//        meuFilme.setAnoDeLancamento(2017);
//        meuFilme.setDuracaoEmMinutos(180);
//
//        meuFilme.exibirFichaTecnica();
//        meuFilme.avalia(8);
//        meuFilme.avalia(7);
//        meuFilme.avalia(10);
//        System.out.println(meuFilme.getSomaDeAvaliacoes());
//        System.out.println(meuFilme.getTotalDeAvaliacoes());
//        System.out.println(String.format("%.2f",meuFilme.retornarMedia()));
//    }

    public static void main(String[] args) {

        IdadePessoa pessoaIdade = new IdadePessoa();

        pessoaIdade.setIdade(32);
        pessoaIdade.setNome("Lucas");
        pessoaIdade.verificarIdade();
    }
}
