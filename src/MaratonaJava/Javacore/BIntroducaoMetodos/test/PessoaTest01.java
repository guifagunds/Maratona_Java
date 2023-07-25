package MaratonaJava.Javacore.BIntroducaoMetodos.test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Pessoa;

import java.security.spec.RSAOtherPrimeInfo;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme");
        pessoa.setIdade(28);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
      //  pessoa.imprime();
    }

}

