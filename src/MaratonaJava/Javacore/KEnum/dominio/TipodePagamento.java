package MaratonaJava.Javacore.KEnum.dominio;

public enum TipodePagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor*0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}