package MaratonaJava.Javacore.Oexception.exception.dominio;

import MaratonaJava.Javacore.Oexception.Dominio.LoginInvalidoException;

import javax.annotation.processing.FilerException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FilerException{
        System.out.println("Salvando pessoa");
    }
}
