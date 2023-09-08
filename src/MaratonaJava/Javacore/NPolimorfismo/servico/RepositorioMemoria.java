package MaratonaJava.Javacore.NPolimorfismo.servico;

import MaratonaJava.Javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }

}

