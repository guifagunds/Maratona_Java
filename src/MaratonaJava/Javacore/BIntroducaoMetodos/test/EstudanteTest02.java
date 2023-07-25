package MaratonaJava.Javacore.BIntroducaoMetodos.test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Valeria";
        estudante01.idade = 30;
        estudante01.sexo = 'F';

        estudante02.nome = "Amanda";
        estudante02.idade = 31;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
