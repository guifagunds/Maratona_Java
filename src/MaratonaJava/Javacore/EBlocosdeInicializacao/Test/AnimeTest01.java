package MaratonaJava.Javacore.EBlocosdeInicializacao.Test;

import MaratonaJava.Javacore.EBlocosdeInicializacao.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+" ");
            
        }


    }
}
