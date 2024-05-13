public class whileInicialNombreC {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("WHILE");

        int i = 0;
        while (i < tamanio) {
            System.out.print("* ");
            if (i == 0 || i == tamanio - 1) {
                int j = 0;
                while (j <= tamanio - 2) {
                    System.out.print("* ");
                    j++;
                }
            }
            System.out.println("");
            i++;
        }
    }
}
