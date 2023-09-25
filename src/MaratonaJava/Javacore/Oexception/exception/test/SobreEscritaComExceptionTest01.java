package MaratonaJava.Javacore.Oexception.exception.test;

import MaratonaJava.Javacore.Oexception.exception.dominio.Funcionario;
import MaratonaJava.Javacore.Oexception.exception.dominio.Pessoa;

public class SobreEscritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        funcionario.salvar();

    }
}
