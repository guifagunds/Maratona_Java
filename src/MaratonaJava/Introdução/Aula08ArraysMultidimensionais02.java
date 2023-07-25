package MaratonaJava.Introdução;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3}; // outras formas de inicializar o array
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};
        // outra forma
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 7}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----------");
            for (int num : arrayBase) {
                System.out.print(num + "  ");
                    }
                }
        //inprimindo o array2
        for (int[] arrayBase2 : arrayInt2) {
            System.out.println("\n-----------");
            for (int num2 : arrayBase2) {
                System.out.print(num2 + "  ");
            }
        }
    }
}
