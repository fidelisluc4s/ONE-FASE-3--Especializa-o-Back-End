import com.google.gson.Gson;

record Editora(String nome, String cidade){}
record Livro(String titulo, String autor, Editora editora) {}

public class Main {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Harry Potter\",\"autor\":\"J. K. Rowling\",\"editora\":{\"nome\":\"Bloombsbury Publishing\",\"cidade\":\"Reino Unido\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}