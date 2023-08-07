package MaratonaJava.Javacore.HHerança.Test;

import MaratonaJava.Javacore.HHerança.Dominio.Funcionario;

public class HerancaTest02 {
    // 0 - bloco de inicialização estático da super classe é executado quando a jvm executar a classe pai
    // 1 - bloco de inicialização estático da sub classe é executado quando a jvm executar a classe filha
    // 2 - Alocado espaço em memória para o objeto da classe pai
    // 3 - Cada atributo de superclasse é criado iniciando com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor da super classe é executado
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo de subclasse é criado iniciando com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Guifa");

    }
}
