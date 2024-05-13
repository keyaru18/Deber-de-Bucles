public class forInicialApellidoT {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("FOR");
        for (int i = 0; i < tamanio; i++) {

            if (i == 0) {
                for (int j = 0; j < tamanio; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int k = 0; k < tamanio - 1; k++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }
        }

    }
}
