public class For_Inicial_Apellido_O {
    //Letra O
    public void F_InicalApellido(int fila, int columna, char character){
        System.out.println();
            for (int i = 0; i < fila; i++) {
                if (i == 0 || i == fila-1) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(character);                    
                    }
                    System.out.println();
                }
                else{
                    for (int j = i; j <= i; j++) {
                        System.out.print(character);
                        for (int j2 = 2; j2 < columna; j2++) {
                            System.out.print(" ");
                        }
                        System.out.println(character);
                    }
                }
            }
        }
}
