package MaratonaJava.Javacore.BIntroducaoMetodos.Dominio;


public class Funcionario2 {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media=0;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario + " ");

        }
    }

    public void imprimeMediaSalarial() {
        if (salarios==null){
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("A média do salario é" + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios(double[] doubles) {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


}
