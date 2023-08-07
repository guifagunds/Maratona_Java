package MaratonaJava.Javacore.HHerança.Test;

import MaratonaJava.Javacore.HHerança.Dominio.Endereco;
import MaratonaJava.Javacore.HHerança.Dominio.Funcionario;
import MaratonaJava.Javacore.HHerança.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Parana");
        endereco.setCep("75999002");
        Pessoa pessoa = new Pessoa("Guilherme Fagundes");
        pessoa.setCpf("8329874334");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Fernando");
        System.out.println(" ----------------");
        funcionario.setCpf("17896000");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(17000);

        funcionario.imprime();





    }
}
