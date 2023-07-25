package MaratonaJava.Introdução;

public class Aula04Operadores {
    public static void main(String[] args) {
        //operadores + - / *
        int numero1 = 20 ;
        double numero2 = 10;
        double resultado = numero1 / numero2 ;
        System.out.println(resultado);

        // % rest0
        double resultadoresto = 20 % 3 ;
        System.out.println(resultadoresto);

        // < > <= >= == != menor q, maior q, menor q/igual, maiorq/igual, igual e diferente
        boolean isVinteMaiorQueTrinta = 20 > 30 ;
        System.out.println("isVinteMaiorQueTrinta "+isVinteMaiorQueTrinta);
        boolean isVinteMenorQueTrinta = 20 < 30 ;
        System.out.println("isVinteMenorQueTrinta " +isVinteMenorQueTrinta);
        boolean isVinteMenorOuIgualATrinta = 20<=30 ;
        System.out.println("isVinteMenorOuIgualATrinta "+isVinteMenorOuIgualATrinta);
        boolean isVinteIgualATrinta = 20 == 30 ;
        System.out.println("IsVinteIgualATrinta "+ isVinteIgualATrinta);
        boolean isVinteDiferenteATrinta = 20 != 30 ;
        System.out.println("IsVinteDiferenteATrinta "+ isVinteDiferenteATrinta);

        // && AND  || OR ! NOT
        int idade = 35 ;
        double salario = 3300 ;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 3500 ;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario <= 3500 ;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        float isValorContaCorrente = 200;
        float isValorContaPoupanca = 10000;
        float valorPlaystation = 5000 ;

        boolean isPlaystationCompravel = isValorContaCorrente >= valorPlaystation || isValorContaPoupanca >= valorPlaystation ;
        System.out.println("isPlaystationCompravel "+isPlaystationCompravel);

        // +=  -=  /=  *=  %= operadores aritméticos
        double bonus = 1800;
        bonus += 1000; // = bonus = bonus + 1000;
        System.out.println(bonus);
        bonus -= 1000; //= bonus = bonus - 1000;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);


        //incrementos
        int contador = 0;
        contador += 1; // contador = contador + 1;
        System.out.println(contador);
        // outra forma de fazer
        contador++; // contador = contador + 1;
        System.out.println(contador);
        contador--; // contador = contador - 1;
        System.out.println(contador);
        //ou
        --contador; //aqui ele decrementa primeiro
        System.out.println(contador);



    }
}
