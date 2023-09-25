package MaratonaJava.Javacore.Oexception.exception.test;

import MaratonaJava.Javacore.Oexception.Dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }
    public static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String userNameBD = "guifagunds";
        String senhaBD = "guifagunds123";
        System.out.println("Usuário:");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhaDigitado = teclado.nextLine();
        if (!userNameBD.equals(userNameDigitado) || !senhaBD.equals(senhaDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso!");

    }
}
