package MaratonaJava.Introdução;

public class Aula06EstruturasdeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count++);
        }
        count = 0;
        do {
            System.out.println("Esse contador é:" + ++count);
        }
        while (count < 10);
// declaraçao de variavel local precisa ser inicializada antes de ser usada
        for (int i=0 ; i<10 ; i++){
            System.out.println("esse é for incrementando mais um" + i);
        }


    }
}
