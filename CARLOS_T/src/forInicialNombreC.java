public class forInicialNombreC {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("");
        System.out.println("FOR");
        for (int i = 0; i < tamanio; i++) {

            System.out.print("*");

            if (i == 0 || i == tamanio - 1) {
                for (int j = 0; j <= tamanio - 2; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}
