package MaratonaJava.Javacore.GAssociacao.test;

import MaratonaJava.Javacore.GAssociacao.dominio.Jogador;
import MaratonaJava.Javacore.GAssociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brazil");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
