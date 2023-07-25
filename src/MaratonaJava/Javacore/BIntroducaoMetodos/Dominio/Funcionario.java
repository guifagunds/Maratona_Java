package MaratonaJava.Javacore.BIntroducaoMetodos.Dominio;


public class Funcionario {
    public String nome;
    public int idade;
    public float salario;


    public void impressao (Funcionario funcionario){
        System.out.println("--------------------------");
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);
        System.out.println(funcionario.salario);
    }
}


