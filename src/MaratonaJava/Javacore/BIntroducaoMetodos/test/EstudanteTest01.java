package MaratonaJava.Javacore.BIntroducaoMetodos.test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Estudante;
import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Valeria";
        estudante01.idade = 30;
        estudante01.sexo = 'F';

        estudante02.nome = "Amanda";
        estudante02.idade = 31;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);

        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);
        System.out.println("------------------");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
