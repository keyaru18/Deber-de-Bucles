public class For_Inicial_Nombre_S {

//Letra S
    public void F_InicialNombre(int fila, int columna, char character) {
        System.out.println();
        System.out.println();
        System.out.println("Metodo For:" );
        System.out.println();
        for (int i = 0; i < fila; i++) {
            if (i == 0 || i == fila/2 || i == fila-1) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(character);                    
                }
                System.out.println();
            }
            else{
                if (i < fila/2) {
                    for (int j = i; j <= i; j++) {
                        System.out.println(character);
                    }
                }
                else{
                    for (int j = i; j <= i; j++) {
                        for (int j2 = 1; j2 < columna; j2++) {
                            System.out.print(" ");
                        }
                    System.out.println(character);
                    }
                }
            }
        } 
    }

    
}




