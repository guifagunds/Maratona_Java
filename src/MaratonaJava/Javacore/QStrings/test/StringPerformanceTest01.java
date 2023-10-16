package MaratonaJava.Javacore.QStrings.test;


public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long incio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println(" Tempo gasto para String " + (fim - incio) + "ms");

        incio = System.currentTimeMillis();
        concatStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println(" Tempo gasto para StringBuilder " + (fim - incio) + "ms");
    }

    public static void concatString(int tamanho){
        String texto = " Olá, meu nome é Guilherme";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
            
        }

    }
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
            
        }
    }
}
