import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Pessoa;

public class Main {
    public static void main(String[] args) {
//        Crie uma classe Pessoa usando o conceito de Record
//        em Java, com atributos como nome, idade e cidade.
//        Em seguida, implemente um programa que
//        utiliza a biblioteca Gson para converter um JSON
//        representando uma pessoa em um objeto do tipo Pessoa.

        String jsonPessoa = "{\"Nome\":\"Lucas\"," +
                "\"Idade\":32," +
                "\"Cidade\":\"Juiz de Fora\"}";

        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);
    }
}