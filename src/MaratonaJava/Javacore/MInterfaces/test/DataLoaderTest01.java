package MaratonaJava.Javacore.MInterfaces.test;

import MaratonaJava.Javacore.MInterfaces.dominio.DatabaseLoader;
import MaratonaJava.Javacore.MInterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
