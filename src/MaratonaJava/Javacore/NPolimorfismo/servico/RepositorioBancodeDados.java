package MaratonaJava.Javacore.NPolimorfismo.servico;

import MaratonaJava.Javacore.NPolimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
