package exercicios;

public class Calculadora {
    double numero;

    double doubloValor(double numero){
        return numero * 2;
    }

    public static class Musica {
        String titulo;
        String artista;
        int anoLancamento;
        int somaAvaliacao;
        int numAvaliacoes;
        double avaliacao;

        void fichaTecnica(){
            System.out.println("""
                    Titulo: """+titulo+"""
                    \nArtista: """+artista+"""
                    \nAno Lançamento: """+anoLancamento+"""
                    \nNúmero Avaliações: """+numAvaliacoes+"""
                    \nAvaliacao: """+avaliacao);
        }

        void avaliar(double nota){
            somaAvaliacao += nota;
            numAvaliacoes++;
        }

        double mediaAvaliacao(){
            avaliacao = somaAvaliacao / numAvaliacoes;
            return avaliacao;
        }
    }

    public static class Pessoa {
        //Crie uma classe exercicios.Calculadora.Pessoa com um método que exibe "Olá, mundo!" no console.

        String nome ;
        int idade;

        void olaMundo(){
            System.out.println("Olá mundo! Seja bem vindo "+nome+" Com a idade: "+idade);
        }
    }
}
