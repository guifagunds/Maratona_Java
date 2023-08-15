package MaratonaJava.Javacore.LClassesAbstratas.Test;

import MaratonaJava.Javacore.LClassesAbstratas.Dominio.Desenvolvedor;
import MaratonaJava.Javacore.LClassesAbstratas.Dominio.Funcionario;
import MaratonaJava.Javacore.LClassesAbstratas.Dominio.Gerente;
import org.w3c.dom.ls.LSOutput;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Guilherme", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Guilherme", 12000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);

    }
}
