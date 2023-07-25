package MaratonaJava.Javacore.BIntroducaoMetodos.test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {0, 1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8);
    }

}
