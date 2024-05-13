public class DoWhile_Inicial_Apellido_O {
    public void Do_Inicial_Apellido(int fila, int columna, char character){
        System.out.println();
        int i = 0;
        do {
            if (i == 0 || i == fila-1) {
                int j = 0;
                do {
                    System.out.print(character);
                    j++;
                } while (j < columna);
                System.out.println();
            }
            else{
                int j = i;
                do {
                    System.out.print(character);
                    int j2 = 2;
                    do {
                        System.out.print(" ");
                        j2++;
                    } while (j2<columna);
                    System.out.println(character);
                    j++;
                } while (j <= i);
            }
            i++;
        } while (i < fila);
    }
}
