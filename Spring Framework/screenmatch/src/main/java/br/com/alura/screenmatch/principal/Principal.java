package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "https://www.omdbapi.com/?t=" ;
    private final String API_KEY = "&apikey=78cdd831";
    private ConsumoApi cosumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = cosumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);


		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i <= dados.totalTemporadas(); i++){
			json = cosumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") +"&season="+ i + API_KEY);
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);

        for (int i = 0; i < dados.totalTemporadas(); i++){
            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
            for (int j = 0; j < episodiosTemporada.size(); j++){
                System.out.println(episodiosTemporada.get(j).titulo());
            }
        }
        //lambda
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

//        //operação intermediaria
//        List<String> nomes = Arrays.asList("Lucas", "Paulo", "Rodrigo", "Luan", "Miguel");
//
//        nomes.stream()//sempre chama
//                .sorted()// ordena
//                .limit(3)//limitar pessoas
//                .filter(n -> n.startsWith("M"))//o nome começa com M
//                .map(n -> n.toUpperCase())// colocar o nome com letra maiusculas
//                .forEach(System.out::println);//imprimir os dados | operaçoes finais

        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())//usando uma lista dentro de outra lista - é diferente do MAP
                .collect(Collectors.toList());//quero jogar essa lista dentro de outra lista;// utilizar quando precisa adicionar algum na lista
//                        .toList()

        System.out.println("\n Top 5 episódios");
        dadosEpisodios.stream()// objetivo pegar os tops 5
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))//onde o dado do epsodio tem q ser diferente e não pode ser N/A
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())// ele vai comparar o dado epsidio pela avaliação e depois vai colocar da maior para menor
                .limit(5)
                .forEach(System.out::println);

        //dadosEpisodios.forEach(System.out::println);
    }
}