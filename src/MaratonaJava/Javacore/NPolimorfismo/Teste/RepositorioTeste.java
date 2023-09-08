package MaratonaJava.Javacore.NPolimorfismo.Teste;

import MaratonaJava.Javacore.NPolimorfismo.repositorio.Repositorio;
import MaratonaJava.Javacore.NPolimorfismo.servico.RepositorioBancodeDados;
import MaratonaJava.Javacore.NPolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Gui");
        list.add("Fer");
        list.add("Val");
        System.out.println(list);

    }
}
