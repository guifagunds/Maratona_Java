package MaratonaJava.Javacore.KEnum.dominio;

public enum TipoCliente {
    PESSOA_FISIC(1),
    PESSOA_JURIDICA(2);

    private  int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
