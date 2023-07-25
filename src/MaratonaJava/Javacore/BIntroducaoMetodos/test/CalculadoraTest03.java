package MaratonaJava.Javacore.BIntroducaoMetodos.test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 5);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20,0));
        System.out.println("----------------------------");
        calculadora.imprimeDivisaoPorDoisNumeros(86,0);

    }
}

