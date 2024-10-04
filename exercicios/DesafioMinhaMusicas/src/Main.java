import br.com.alura.desafiominhamusicas.calculos.models.MinhasPreferidas;
import br.com.alura.desafiominhamusicas.calculos.models.Musica;
import br.com.alura.desafiominhamusicas.calculos.models.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("Link Park");
        musica1.setArtista("Cjester");
        musica1.setGenero("Rock");

        for (int i = 0; i < 100; i++) {
            musica1.reproduzir();
        }
        for (int i = 0; i < 100; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Boa noite com JO");
        podcast1.setApresentador("Jo");

        for (int i = 0; i < 100; i++) {
            podcast1.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            podcast1.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);
    }
}