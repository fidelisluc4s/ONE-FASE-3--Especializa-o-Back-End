import execao.SenhaInvalidaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = leitura.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido. ");
        }catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8){
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 carac. ");
        }
    }
}