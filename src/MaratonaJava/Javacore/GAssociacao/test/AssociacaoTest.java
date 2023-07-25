package MaratonaJava.Javacore.GAssociacao.test;

import MaratonaJava.Javacore.GAssociacao.dominio.Aluno;
import MaratonaJava.Javacore.GAssociacao.dominio.Local;
import MaratonaJava.Javacore.GAssociacao.dominio.Professor;
import MaratonaJava.Javacore.GAssociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua: Paraná");
        Aluno aluno = new Aluno("Gu", 17);
        Professor professor = new Professor(" Adelaide", "Português");
        Aluno [] alunosParaSemiario = {aluno};

        Seminario seminario = new Seminario("Como não constrair Dsts",alunosParaSemiario,local);

        Seminario [] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
