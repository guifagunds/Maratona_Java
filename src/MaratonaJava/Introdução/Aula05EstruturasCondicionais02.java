package MaratonaJava.Introdução;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 18;
        String categoria = "";
        if (idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade >= 15){
            categoria = "Categoria Juvenil";
        }if(idade >=18){
            categoria = "Categoria Adulto";
        }
            System.out.println(categoria);

    }
}
