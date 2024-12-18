import br.com.alura.desafioViaCEP.model.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        String buscaFormatada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        List<Endereco> enderecos = new ArrayList<>();

        Gson gson = new GsonBuilder()// Configurações personalizadas para manipulação de JSON
                .setPrettyPrinting()
                .create(); //Gera a instância do Gson configurado.

        System.out.println("Digite seu CEP");
        busca = leitura.nextLine();

        String jsonEndereco = "https://viacep.com.br/ws/" + busca + "/json/";


        Endereco meuEndereco = null;
        try { // Função: Tenta executar o código no bloco e captura exceções, caso ocorram.
            HttpClient client = HttpClient.newHttpClient();//Utilizado para enviar requisições e receber respostas.
            //Construindo a Requisição HTTP
            HttpRequest request = HttpRequest.newBuilder()// Inicia a construção de uma requisição.
                    .uri(URI.create(jsonEndereco))// Define o destino da requisição com base na URL jsonEndereco
                    .GET()//Especifica que a requisição será do tipo GET
                    .build();//Finaliza a construção da requisição.

            //Enviando a Requisição
            HttpResponse<String> response = client// Envia a requisição HTTP criada
                    .send(request, HttpResponse.BodyHandlers.ofString());// Processa a resposta como uma string

            //Capturando o JSON
            String json = response.body(); //Obtém o conteúdo do corpo da resposta HTTP, neste caso, o JSON retornado pela API
            meuEndereco = gson.fromJson(response.body(), Endereco.class);
            System.out.println("Endereco: " + meuEndereco);

            enderecos.add(meuEndereco);
            System.out.println(json);
        } catch (NumberFormatException |
                 IOException e) {//NumberFormatException Caso a entrada do usuário não seja um número válido.
            // IOException: Para erros de entrada/saída durante a requisição.
            System.out.println("Aconteceu um erro");
        } catch (InterruptedException e) {//InterruptedException: Caso a requisição seja interrompida.
            throw new RuntimeException(e);
        }

        System.out.println(jsonEndereco);// imprime a url


        FileWriter endereco = new FileWriter("endereco.json");
        endereco.write(gson.toJson(meuEndereco));
        endereco.close();

        System.out.println("Programa finalizou com sucesso");
        leitura.close();
    }
}