package MaratonaJava.Javacore.HHerança.Dominio;

public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionario 2");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionario");

    }

    public void relatorioPagamento(){
        System.out.println(" Eu "+this.nome+ "recebi o salario de "+this.salario);
    }
    public double getSalario(double salario) {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
