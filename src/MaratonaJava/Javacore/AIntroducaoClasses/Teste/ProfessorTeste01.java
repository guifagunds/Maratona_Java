package MaratonaJava.Javacore.AIntroducaoClasses.Teste;

import MaratonaJava.Javacore.AIntroducaoClasses.Dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome="Girafalles";
        professor.idade=46;
        professor.sexo='M';
        System.out.println(professor.nome+" idade " +professor.idade +" do sexo " +professor.sexo);
    }
}
