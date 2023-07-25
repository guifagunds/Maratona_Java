package MaratonaJava.Javacore.GAssociacao.test;

import MaratonaJava.Javacore.GAssociacao.dominio.Escola;
import MaratonaJava.Javacore.GAssociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Caetano Petraglia", professores);

        escola.imprime();



    }
}
