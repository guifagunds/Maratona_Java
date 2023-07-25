package MaratonaJava.Javacore.BIntroducaoMetodos.test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Funcionario;
import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.ImpressoraFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        ImpressoraFuncionario impressoraFuncionario = new ImpressoraFuncionario();
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Roberto";
        funcionario01.idade=43;
        funcionario01.salario=3400;

        funcionario02.nome = "Maria";
        funcionario02.idade=39;
        funcionario02.salario=3300;

        funcionario03.nome = "Patricia";
        funcionario03.idade=29;
        funcionario03.salario=3000;

        impressoraFuncionario.impressao(funcionario01);
        impressoraFuncionario.impressao(funcionario02);
        impressoraFuncionario.impressao(funcionario03);

        float mediaDosSalarios;
        mediaDosSalarios=funcionario01.salario+funcionario02.salario+funcionario03.salario;
        System.out.println("A média dos três salários é:"+mediaDosSalarios);

    }
}
