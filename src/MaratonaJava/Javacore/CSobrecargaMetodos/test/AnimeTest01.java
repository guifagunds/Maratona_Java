package MaratonaJava.Javacore.CSobrecargaMetodos.test;

import MaratonaJava.Javacore.CSobrecargaMetodos.dominio.Anime;

public class AnimeTest01{
    public static void main(String[] args) {
        Anime anime = new Anime();
       anime.init("Sakura","TV",12);
        anime.init("Sakura","TV",12, "Ação");
        anime.imprime();
    }
}
