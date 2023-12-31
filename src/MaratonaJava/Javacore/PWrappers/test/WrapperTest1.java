package MaratonaJava.Javacore.PWrappers.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'G';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //boxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'G';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('A'));
        System.out.println(Character.toLowerCase('A'));
    }

}
