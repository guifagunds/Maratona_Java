package MaratonaJava.Introdução;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        if (idade >= 18) {
            System.out.println("Você é maior de 18, pode beber bidas alcoolicas");
        }
        // outra forma de fazer
        int idadeIdade = 15;
        boolean isAutorizadoAComprarBebida = idadeIdade >= 18;
        if (isAutorizadoAComprarBebida) {
            System.out.println("Você pode comprar bebida");
        } else {
            System.out.println("Não autorizado a comprar bebida");
// aqui em baixo ele funciona separadamente da estrutura e como o NOT !
            if (!isAutorizadoAComprarBebida) {
                System.out.println("Você não pode comprar bebida");
            }
        }
    }
}
