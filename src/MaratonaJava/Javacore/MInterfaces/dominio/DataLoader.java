package MaratonaJava.Javacore.MInterfaces.dominio;

public interface DataLoader {
    public abstract void load();
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
