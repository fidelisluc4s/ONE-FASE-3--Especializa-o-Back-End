package br.com.alura.desafio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Desafio2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio2Application.class, args);
	}

	interface Multiplicacao {
		int multiplicacao(int a, int b);
	}

	interface NumeroPrimo {
		boolean numeroPrimo(int c);
	}

	interface ConvertaMaiuscula {
		String letra(String s);
	}

	interface Palindromo {
		boolean verificarPalindromo(String str);
	}

	interface Divisor{
		int dividir(int f, int g) throws ArithmeticException;
	}

	@Override
	public void run(String... args) throws Exception {
		Multiplicacao multiplique = (a,b) -> a * b;

		System.out.println(multiplique.multiplicacao(5 , 4));

		NumeroPrimo numeroPrimo = (c) -> {
			if (c <= 1) return false;
			for (int i = 2; i <= Math.sqrt(c); i++){
				if (c % i == 0)
					return false;
			}
			return true;
		};
		System.out.println(numeroPrimo.numeroPrimo(11));
		System.out.println(numeroPrimo.numeroPrimo(12));

		ConvertaMaiuscula toUpperCase = s -> s.toUpperCase();
		System.out.println(toUpperCase.letra("java"));

		Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
		System.out.println(palindromo.verificarPalindromo("radar"));
		System.out.println(palindromo.verificarPalindromo("java"));

		List<Integer> numero = Arrays.asList(1,2,3,4,5);
		numero.replaceAll(n -> n * 3);
		System.out.println(numero);

		List<String> nomes = Arrays.asList("Lucas", "Maria", "João", "Ana");
		nomes.sort((d,e) -> d.compareTo(e));
		System.out.println(nomes);

		Divisor divisor = (f, g) -> {
			if (g == 0 ) throw new ArithmeticException("Divisao por zero");
			return f / g;
		};
			try {
				System.out.println(divisor.dividir(10, 2));
				System.out.println(divisor.dividir(10, 0));
			}catch (ArithmeticException e){
				System.out.println(e.getMessage());
			}



		}
	}

