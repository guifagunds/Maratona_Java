package MaratonaJava.Javacore.FModificadoresEstaticos.domain;

public class Carro {
    private String nome;
    private double VelocidadeMaxima;
    public static double VelocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        VelocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade Máxima "+this.getVelocidadeMaxima());
        System.out.println("Velocidade Limite "+Carro.VelocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.VelocidadeLimite=velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.VelocidadeLimite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }


}


