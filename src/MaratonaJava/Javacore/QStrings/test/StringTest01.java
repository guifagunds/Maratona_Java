package MaratonaJava.Javacore.QStrings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Guilherme";
        String nome2 = "Guilherme";
        nome = nome.concat("Fagundes"); // mesma coisa que: nome += "Guilherme";
        System.out.println(nome);
        System.out.println(nome==nome2);
        String nome3 = new String("Guilherme"); // 1 variavel de referencia, 2 objeto do tipo String, 3 uma string no pool de string
        System.out.println(nome2==nome3);
        System.out.println(nome2==nome3.intern());


    }
}
