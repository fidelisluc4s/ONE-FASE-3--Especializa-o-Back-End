import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;
import exerciciosJavaOo.model.Aluno;
import exerciciosJavaOo.model.IdadePessoa;
import exerciciosJavaOo.model.Livro;
import exerciciosJavaOo.model.Produto;


public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        Serie serie1 = new Serie();
        serie1.setNome("Sobre Natural");
        serie1.setEpisodiosPorTemporada(20);;
        serie1.setTemporadas(18);
        serie1.setMinutosPorEpisodio(45);
        System.out.println("Duração do Serie "+serie1.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Harry Potter");
        outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calcu = new CalculadoraDeTempo();
        System.out.println(meuFilme.getDuracaoEmMinutos());
        calcu.inclui(meuFilme);
        calcu.inclui(outroFilme);
        calcu.inclui(serie1);
        System.out.println("Tempo: "+calcu.getTempoTotal());

    }



}





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
//
//        IdadePessoa pessoaIdade = new IdadePessoa();
//
//        pessoaIdade.setIdade(32);
//        pessoaIdade.setNome("Lucas");
//        pessoaIdade.verificarIdade();
//    }

//    public static void main(String[] args) {
//
//        Produto produto1 = new Produto("Coca-Cola", 8.00);
//
//        System.out.println("Nome do Produto: " + produto1.getNome());
//        System.out.println("Valor: " + produto1.getPreco());
//
//        produto1.aplicarDesconto(10);
//
//        System.out.println("Novo Preço com desconto: "+produto1.getPreco());
//    }

//    public static void main(String[] args) {
//
//        Aluno aluno1 = new Aluno("Lucas", 9, 10,7);
//
//        System.out.println(aluno1.getNome());
//        System.out.println(aluno1.getNota1());
//        System.out.println(aluno1.getNota2());
//        System.out.println(aluno1.getNota3());
//
//        System.out.println(String.format("O aluno: %s\nAs médias das notas é: %.2f ",aluno1.getNome(),aluno1.calcularMedia()));
//
//    }

//    public static void main(String[] args) {
//
//        Livro livro1 = new Livro("Harry Potter", "J.Rowlden");
//
//        System.out.println("Titulo: "+ livro1.getTitulo());
//        System.out.println("Autor: "+ livro1.getAutor());
//
//    }

