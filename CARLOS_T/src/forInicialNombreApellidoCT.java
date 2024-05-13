public class forInicialNombreApellidoCT {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("FOR");
        
        for (int i = 0; i < tamanio; i++) {

            if (i == 0) {
                for (int j = 0; j <= tamanio * 2; j++) {

                    if (j < tamanio) {
                        System.out.print("* ");
                    } else if (j == tamanio) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println("");
            } else if (i < tamanio - 1) {

                for (int j = 0; j <= tamanio * 2; j++) {
                    if (j == 0) {
                        System.out.print("* ");
                    } else if (j <= tamanio) {
                        System.out.print("  ");
                    } else if (j < tamanio * 2) {
                        System.out.print(" ");
                    } else {
                        System.out.println("* ");
                    }
                }

            } else {
                for (int j = 0; j <= tamanio * 2; j++) {
                    if (j < tamanio) {
                        System.out.print("* ");
                    } else if (j <= tamanio) {
                        System.out.print("  ");
                    } else if (j < tamanio * 2) {
                        System.out.print(" ");
                    } else {
                        System.out.println("* ");
                    }
                }
            }
        }
    }
}
