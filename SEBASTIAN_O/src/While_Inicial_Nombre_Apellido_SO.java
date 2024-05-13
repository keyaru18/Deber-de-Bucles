public class While_Inicial_Nombre_Apellido_SO {
    public void W_InicalNombreApellido(int fila, int columnaS,int columnaO, char character) {
        System.out.println();
        int i = 0;
        while (i < fila) {
            if (i == 0 || i == fila/2 || i == fila-1) {
                if (i == 0 || i == fila-1) {
                    int j2 = 0;
                    while (j2<2) {
                        if (j2==0) {
                            int k = 0;
                            while (k < columnaS) {
                                System.out.print(character);
                                k++;
                            }
                            System.out.print(" ");
                        }
                        else{
                            int k = 0;
                            while (k < columnaO) {
                                System.out.print(character);
                                k++;
                            }
                            System.out.println();
                        }
                        j2++;
                    }
                }
                else if (i == fila/2) {
                    int j2 = 0;
                    while (j2 < 2) {
                        if (j2 == 0) {
                            int k = 0;
                            while (k < columnaS) {
                                System.out.print(character);
                                k++;
                            }
                            System.out.print(" ");
                        }
                        else{
                            System.out.print(character);
                            int k = 2;
                            while (k < columnaO) {
                                System.out.print(" ");
                                k++;
                            }
                            System.out.println(character);
                        }
                        j2++;
                    }
                }
            }
            else{
                if(i < fila/2){
                    int j =i;
                    while (j <= i) {
                        System.out.print(character);
                        int j2 = 0;
                        while (j2 < columnaS) {
                            System.out.print(" ");
                            j2++;
                        }
                        System.out.print(character);
                        int x = 2;
                        while (x < columnaO) {
                            System.out.print(" ");
                            x++;
                        }
                        System.out.println(character);
                        j++;
                    }
                }
                else{
                    int j = i;
                    while (j <= i) {
                        int j2 = 1;
                        while (j2 < columnaS) {
                            System.out.print(" ");
                            j2++;
                        }
                        System.out.print(character + " " + character);
                        int z = 2;
                        while (z < columnaO) {
                            System.out.print(" ");
                            z++;
                        }
                        System.out.println(character);
                        j++;
                    }
                }
            }
            i++;
        }
    }
}