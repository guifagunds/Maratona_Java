package MaratonaJava.Introdução;
/*
crie variaveis para os itens que estao entre <> e imprima a seguinte mensagem:
Eu <nome> morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Guilherme";
        double salario = (double) 3.223;
        String endereco = " Rua Travessa dos Esportes numero34";
        String dataRecebimentoSalario = "07/07/2023";
        String relatorio = "Eu" +nome+ ", morando no endereço "+endereco+", confirmo que recebi o salario de " +salario+" na data " +dataRecebimentoSalario;
        System.out.println (relatorio);

        /*outra resolução seria a opção de baixo*/

        System.out.println( "Eu " +nome+ ", morando no endereço "+endereco+", confirmo que recebi o salario de " +salario+" na data " +dataRecebimentoSalario);
    }
}
