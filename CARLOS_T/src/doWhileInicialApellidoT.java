public class doWhileInicialApellidoT {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("DO WHILE");
        int i = 0;
        do {
            if (i == 0) {
                int j = 0;
                do {
                    System.out.print("* ");
                    j++;
                } while (j < tamanio);
                System.out.println();
            } else {
                int k = 0;
                do {
                    System.out.print(" ");
                    k++;
                } while (k < tamanio - 1);
                System.out.println("*");
            }
            i++;
        } while (i < tamanio);
    }
}
