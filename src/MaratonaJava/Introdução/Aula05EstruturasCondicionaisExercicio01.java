package MaratonaJava.Introdução;

public class Aula05EstruturasCondicionaisExercicio01 {
    public static void main(String[] args) {
        double salario1 = 500000;
        String qualTaxa = "";
        if (salario1 <= 4712) {
            qualTaxa = "9,70";
        } else if (salario1 >= 4712) {
            qualTaxa = "37,5";
        }
        if (salario1 >= 68508) {
            qualTaxa = "50";
        }
        System.out.println("A taxa a ser paga é de " + qualTaxa+ "%");
    }
}
