package MaratonaJava.Javacore.BIntroducaoMetodos.test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Funcionario2;

public class Funcionario2Teste01 {
    public static void main(String[] args) {
        Funcionario2 funcionario2 = new Funcionario2();
        funcionario2.setNome("Gustavo");
        funcionario2.setIdade(30);
        funcionario2.setSalarios(new double[]{1222.00,987.82,2000.00});

        funcionario2.imprime();

        funcionario2.imprimeMediaSalarial();

        System.out.println("Média" + funcionario2.getMedia());


    }
}
