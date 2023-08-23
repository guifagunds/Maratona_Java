package MaratonaJava.Javacore.MInterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // tipos de modificadores de acesso: private -> default -> protect -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados ");

    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes no banco de dados");
    }
}
