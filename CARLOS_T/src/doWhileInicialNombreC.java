public class doWhileInicialNombreC {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("DO WHILE");
        int i = 0;
        do {
            System.out.print("* ");
            if (i == 0 || i == tamanio - 1) {
                int j = 0;
                do {
                    System.out.print("* ");
                    j++;
                } while (j <= tamanio - 2);
            }
            System.out.println("");
            i++;
        } while (i < tamanio);
    }
}
