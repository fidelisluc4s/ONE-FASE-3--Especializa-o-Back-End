package exerciciosJavaOo.model;

public class Livro {
//    Desenvolva uma classe Livro
//    com os atributos privados
//    titulo e autor.
//    Utilize métodos getters e setters
//    para acessar e modificar esses atributos.
//    Adicione um método exibirDetalhes que
//    imprime o título e o autor do livro.

    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("O autor do livro"+titulo+
                " é nada mais e nada menos o "+autor);
    }
}
