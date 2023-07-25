package MaratonaJava.Introdução;

public class Aula06EstruturasdeRepeticao03 {
    public static void main(String[] args) {
        //imprimir os primeiros 25 numeros de um dado valor, Por exemplo 50
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; ++i)
        {
            if (i > 25) {
                break;
            }
            System.out.println(i);


        }
    }
}
