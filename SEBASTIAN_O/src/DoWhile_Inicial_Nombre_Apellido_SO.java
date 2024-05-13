public class DoWhile_Inicial_Nombre_Apellido_SO {
    public void Do_Inicial_Nombre_Apellido(int fila, int columnaS,int columnaO, char character){
        System.out.println();
        int i = 0;
        do {
            if (i == 0 || i == fila/2 || i == fila-1) {
                if (i == 0 || i == fila-1) {
                    int j2 = 0;
                    do {
                        if (j2 == 0) {
                            int k = 0;
                            do {
                                System.out.print(character);
                                k++;
                            } while (k < columnaS);
                            System.out.print(" ");
                        }
                        else{
                            int k = 0;
                            do {
                                System.out.print(character);
                                k++;
                            } while (k < columnaO);
                            System.out.println();
                        }
                        j2++;
                    } while (j2 < 2);
                }
                else if(i == fila/2){
                    int j2 = 0;
                    do {
                        if (j2 == 0) {
                            int k = 0;
                            do {
                                System.out.print(character);
                                k++;
                            } while (k < columnaS);
                            System.out.print(" ");
                        }
                        else{
                            System.out.print(character);
                            int k = 2;
                            do {
                                System.out.print(" ");
                                k++;
                            } while (k < columnaO);
                            System.out.println(character);
                        }
                        j2++;
                    } while (j2 < 2);
                }
            }
            else{
                if (i < fila/2) {
                    int j = i;
                    do {
                        System.out.print(character);
                        int j2 = 0;
                        do {
                            System.out.print(" ");
                            j2++;
                        } while (j2 < columnaS);
                        System.out.print(character);
                        int a = 2;
                        do {
                            System.out.print(" ");
                            a++;
                        } while (a < columnaO);
                        System.out.println(character);
                        j++;
                    } while (j <= i);
                }
                else{
                    int j = i;
                    do {
                        int j2 = 1;
                        do {
                            System.out.print(" ");
                            j2++;
                        } while (j2 < columnaS);
                        System.out.print(character + " " + character);
                        int a = 2;
                        do {
                            System.out.print(" ");
                            a++;
                        } while (a < columnaO);
                        System.out.println(character);
                        j++;
                    } while (j <= i);
                }
            }
            i++;
        } while (i < fila);  
    }
}
