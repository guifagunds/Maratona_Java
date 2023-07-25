package MaratonaJava.Introdução;

public class Aula05EstruturasCondicionais06 {
    //criar um código que diz qual dia da semana é dia útil, começando pelo domingo
    public static void main(String[] args) {
        byte dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil!");
                break;
            default:
                System.out.println("Dia inexistente!");
                break;

        }
    }
}
