package MaratonaJava.Javacore.AIntroducaoClasses.Teste;

import MaratonaJava.Javacore.AIntroducaoClasses.Dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Guilherme";
        estudante.idade = 28;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
