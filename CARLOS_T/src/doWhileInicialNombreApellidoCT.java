public class doWhileInicialNombreApellidoCT {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("DO WHILE");
        int i = 0;
        do {

            if (i == 0) {
                int j = 0;
                do {
                    if (j < tamanio) {
                        System.out.print("* ");
                    } else if (j == tamanio) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                    j++;
                } while (j <= tamanio * 2);
                System.out.println("");

            } else if (i < tamanio - 1) {

                int j = 0;
                do {

                    if (j == 0) {
                        System.out.print("* ");
                    } else if (j <= tamanio) {
                        System.out.print("  ");
                    } else if (j < tamanio * 2) {
                        System.out.print(" ");
                    } else {
                        System.out.println("* ");
                    }

                    j++;
                } while (j <= tamanio * 2);

            } else {
                int j = 0;
                do {
                    if (j < tamanio) {
                        System.out.print("* ");
                    } else if (j <= tamanio) {
                        System.out.print("  ");
                    } else if (j < tamanio * 2) {
                        System.out.print(" ");
                    } else {
                        System.out.println("* ");
                    }
                    j++;
                } while (j <= tamanio * 2);
            }
            i++;
        } while (i < tamanio);
    }
}
