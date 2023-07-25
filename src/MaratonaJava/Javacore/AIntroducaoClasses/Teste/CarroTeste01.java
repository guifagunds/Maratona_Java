package MaratonaJava.Javacore.AIntroducaoClasses.Teste;

import MaratonaJava.Javacore.AIntroducaoClasses.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiesta";
        carro1.modelo = "Ford Fiesta";
        carro1.ano = 2012;

        carro2.nome= "Toro";
        carro2.modelo = "Ford Toro";
        carro2.ano=2022;

        carro1=carro2;

        System.out.println("A marca do carro é"+carro1.nome+ " o seu nome é " +carro1.modelo+" do ano de " +carro1.ano);
        System.out.println("A marca do carro é"+carro2.nome+ " o seu nome é " +carro2.modelo+" do ano de " +carro2.ano);

    }
}
