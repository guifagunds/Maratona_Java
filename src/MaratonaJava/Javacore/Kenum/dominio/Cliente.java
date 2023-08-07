package MaratonaJava.Javacore.Kenum.dominio;

public class Cliente {
    public enum tipoDePagamento{
        DEBITO, CREDITO;
    }
    private String nome;
    private TipoCliente tipoCliente;
    private tipoDePagamento tipoDePagamento;

    public Cliente(String nome, TipoCliente tipoCliente, Cliente.tipoDePagamento tipoDePagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoDePagamento = tipoDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente=" + tipoCliente.getValor() +
                ", tipoDePagamento=" + tipoDePagamento +
                '}';
    }
}
