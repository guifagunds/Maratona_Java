package MaratonaJava.Javacore.GAssociacao.test;

import MaratonaJava.Javacore.GAssociacao.dominio.Jogador;
import MaratonaJava.Javacore.GAssociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        Jogador [] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-----------Jogador");
        jogador.imprime();
        System.out.println("-----------Time");
        time.imprime();


    }
}
