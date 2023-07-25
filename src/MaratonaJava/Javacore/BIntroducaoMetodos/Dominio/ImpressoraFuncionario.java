package MaratonaJava.Javacore.BIntroducaoMetodos.Dominio;

public class ImpressoraFuncionario {
    public void impressao (Funcionario funcionario){
        System.out.println("--------------------------");
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        System.out.println(funcionario.salario);
    }
}
