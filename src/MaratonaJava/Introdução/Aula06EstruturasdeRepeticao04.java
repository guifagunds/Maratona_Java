package MaratonaJava.Introdução;

public class Aula06EstruturasdeRepeticao04 {
    public static void main(String[] args) {
        //dado o valor de um carro 30000, descubra em quantas vezes ele pode ser parcelado
        // a condição é que a parcela deve ser igual a 1.000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break; // da mesma forma podemos inverter a logica do codigo para decrementar as parcelas
                //de 30 para 1 e ao inves de usar o break usaremos o continue
            }
            System.out.println("Esta é a parcela numero: "+parcela+" no valor de: "+valorParcela);
        }
    }
}

