import br.com.alura.screen.model.Titulo;
import br.com.alura.screen.model.Veiculo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        var conteudo = "Conteudo a ser gravado no arquivo.";
        Titulo titulo1 = new Titulo("Harry Potter",2000);
        Veiculo veiculo1 = new Veiculo("Corsa",2000, "vermelho");


        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        try {
            FileWriter arquivo = new FileWriter("arquivo.txt");
            arquivo.write(gson.toJson(veiculo1));
            arquivo.write(gson.toJson(titulo1));
            arquivo.close();

            System.out.println("Programa finalizou corretamente.");
            System.out.println(veiculo1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}