package MaratonaJava.Javacore.VIo.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File("/Users/macbookpro/IdeaProjects/Maratona_Java/src");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

    }
}
