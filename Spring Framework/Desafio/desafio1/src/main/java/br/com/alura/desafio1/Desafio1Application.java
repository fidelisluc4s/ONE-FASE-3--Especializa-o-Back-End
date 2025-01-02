package br.com.alura.desafio1;

import br.com.alura.desafio1.model.Tarefa;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Olá, Contador!");
		System.out.println("===================");
		System.out.println("Digite um número para contagem: ");
		Scanner leitura = new Scanner(System.in);
		var numero = leitura.nextInt();

		for (int i = 0; i <= numero; i++){
			System.out.println(i + " ");
		}
		//serializar o objeto tarefa
		Tarefa tarefa = new Tarefa("assistir aula 1", false, "Lucas");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Dados salvos no arquivo tarefa.json");

		//desserializar os dados
		ObjectMapper objectMapper2 = new ObjectMapper();
		Tarefa tarefaLida = objectMapper2.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do JSON: ");
		System.out.println(tarefaLida);
	}
}
