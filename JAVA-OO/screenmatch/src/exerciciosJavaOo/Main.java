package exerciciosJavaOo;

import exerciciosJavaOo.model.IdadePessoa;

public class Main {

    public static void main(String[] args) {

        IdadePessoa pessoaIdade = new IdadePessoa();

        pessoaIdade.setIdade(32);
        pessoaIdade.setNome("Lucas");
        pessoaIdade.verificarIdade();
    }
}
