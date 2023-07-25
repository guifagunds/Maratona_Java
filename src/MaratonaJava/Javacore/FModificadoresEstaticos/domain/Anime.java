package MaratonaJava.Javacore.FModificadoresEstaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - bloco de inicialização é executado quando a jvm executar a classe
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado iniciando com valores defautl ou o que for
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {

        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    {
        System.out.println("Bloco de incicialização não estático 4");
    }

    public Anime(String nome) {
        this.nome=nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio+" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}


