public class whileInicialApellidoT {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("WHILE");
        
        int i = 0;
        while (i < tamanio) {
            if (i == 0) {
                int j = 0;
                while (j < tamanio) {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
            } else {
                int k = 0;
                while (k < tamanio - 1) {
                    System.out.print(" ");
                    k++;
                }
                System.out.println("*");
            }
            i++;
        }

    }
}
