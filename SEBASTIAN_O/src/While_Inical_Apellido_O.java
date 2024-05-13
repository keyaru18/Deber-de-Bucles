public class While_Inical_Apellido_O {
    public void W_InicialApellido(int fila, int columna, char character){
        System.out.println();
        int i = 0;
        while (i < fila) {
            if (i == 0 || i == fila-1) {
                int j = 0;
                while (j < 4) {
                    System.out.print(character); 
                    j++;                    
                }
                System.out.println();
            }
            else{
                int j = i;
                while (j <= i) {
                    System.out.print(character);
                    int j2 = 2;
                    while (j2 < columna) {
                        System.out.print(" ");
                        j2++;
                    }
                    System.out.println(character);
                    j++;
                }
            }
            i++;
        }
    }
}
