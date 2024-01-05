package MaratonaJava.Javacore.VIo.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)){
            fw.write("Java é a melhor linguagem de programação\n Continuando sobre Java... ");
            fw.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
