package MaratonaJava.Javacore.YColecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Guilherme");
        nomes.add("Fagundes");
        nomes.add("Desenvolvedor");
        nomes.add("Java");
//        System.out.println(nomes.remove(0));

        nomes.addAll(nomes2);
        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-------------");
        int size = nomes.size();
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
