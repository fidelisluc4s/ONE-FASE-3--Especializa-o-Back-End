import br.com.alura.exercicioanimal.model.Animal;
import br.com.alura.exercicioanimal.model.Cachorro;
import br.com.alura.exercicioanimal.model.Gato;

public class Main {
    public static void main(String[] args) {

        Gato gato1 = new Gato();
        Cachorro cachorro1 = new Cachorro();

        gato1.emitirSom();
        cachorro1.emitirSom();

    }
}