import java.time.LocalDate;

public class Carro {
    String modeloCarro;
    String cor;
    int ano;
    LocalDate dataAtual = LocalDate.now();
    int idade;

    void fichaTecnica(){
        System.out.println("""
                Modelo do Carro: """+modeloCarro+ """
                \nAno do carro: """+ano+ """
                \nCor: """+cor);
    }

    int anoCarro(int idade){
        idade = dataAtual.getYear() - ano;
        return idade;
    }

}
