import br.com.alura.estruturadedados.Aluno;
import br.com.alura.estruturadedados.Vetor;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();

//        System.out.println(lista.tamanho());
        lista.adiciona(0,a1);
//        System.out.println(lista.tamanho());
        lista.adiciona(1,a2);
//        System.out.println(lista.tamanho());
//        System.out.println(lista);
//        System.out.println(lista.contem(a1));

        Aluno a3 = new Aluno("Danilo");
        lista.adiciona(2, a3);
//        System.out.println(lista.contem(a3));

//        Aluno x = lista.pega(1);
//        System.out.println(x);

        for(int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Joao" + i);
            lista.adiciona(y);
        }
        System.out.println(lista);
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);
    }
}