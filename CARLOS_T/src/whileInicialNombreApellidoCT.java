public class whileInicialNombreApellidoCT {
    public void imprimirTamanioCaracter(int tamanio) {
        System.out.println("WHILE");
        
        int i = 0;
		while (i < tamanio) {

			if (i == 0) {
				int j = 0;
				while (j <= tamanio*2) {
					if (j < tamanio) {
						System.out.print("* ");
					} else if (j == tamanio) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
					j++;
				}
				System.out.println("");

			} else if (i < tamanio - 1) {

				int j = 0;
				while (j <= tamanio * 2) {

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
				}

			} else {
				int j = 0;
				while (j <= tamanio * 2) {
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
				}
			}
			i++;
		}
    }
}
