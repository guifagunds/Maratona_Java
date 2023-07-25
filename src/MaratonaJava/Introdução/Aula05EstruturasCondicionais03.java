package MaratonaJava.Introdução;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //condicional para doação de salario caso for maior que 3000
        double salario = 3500;
        String mensagemParaDoar = "Vamos doar um valor de 500 reais";
        String mensagemNaoDoar = "Não temos o suficiente para doar";
        String resultado = "";
        if (salario >=3000){
            resultado = mensagemParaDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

// outra forma mais limpa de desenvolver condicional
        double salario1 = 2500;
        // condicao ? verdadeiro : falso
        System.out.println(salario1>=3500 ? "Eu vou doar" : "Eu não vou doar");
    // ou declarar as strings com a mensagem e colocar as strings nas condições
    }
}
