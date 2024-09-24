public class Musica {
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
