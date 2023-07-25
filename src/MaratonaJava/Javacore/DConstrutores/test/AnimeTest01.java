package MaratonaJava.Javacore.DConstrutores.test;

import MaratonaJava.Javacore.DConstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Guifa", "TV", 12, "drama", "Disney");
        Anime anime2 = new Anime();
        //   anime.init("Sakura","TV",12);
        //    anime.init("Sakura","TV",12, "Ação");
        anime.imprime();


    }
}
