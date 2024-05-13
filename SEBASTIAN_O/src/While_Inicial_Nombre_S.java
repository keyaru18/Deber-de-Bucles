public class While_Inicial_Nombre_S {
    public void W_Inicial_Nombre(int fila, int columna, char character){
        System.out.println();
        System.out.println("Metodo While:" );
        System.out.println();
        int i = 0;
        while(i < fila){
            if (i==0 || i==fila/2 || i==fila-1) {
                int j = 0;
                while (j < columna) {
                    System.out.print(character);
                    j++;
                }
                System.out.println();
            }
            else{
                if (i<fila/2) {
                    int j = i;
                    while (j <= i) {
                        System.out.println(character);
                        j++;
                    }
                }
                else{
                    int j = i;
                    while (j <= i) {
                        int j2 = 1;
                        while (j2 < columna) {
                            System.out.print(" ");
                            j2++;
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
