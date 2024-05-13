public class For_Inicial_Nombre_Apellido_SO {
    public void F_NombreApellido(int fila, int columnaS,int columnaO, char character){
        System.out.println();
        for (int i = 0; i < fila; i++) {
            if (i == 0 || i == fila/2 || i == fila-1) {
                if(i == 0 || i == fila-1){
                    for (int j2 = 0; j2 <2 ; j2++) {
                        if(j2 == 0){
                            for (int k = 0; k < columnaS; k++) {
                                System.out.print(character);
                            }
                            System.out.print(" ");
                        }
                        else{
                            for (int k = 0; k < columnaO; k++) {
                                System.out.print(character);
                            }
                            System.out.println();
                        }
                    }
                }
                else if(i == fila/2){
                    for (int j2 = 0; j2 < 2; j2++) {
                        if(j2 == 0){
                            for (int k = 0; k < columnaS; k++) {
                                System.out.print(character);
                            }
                            System.out.print(" ");
                        }
                        else{
                            System.out.print(character);
                            for (int k = 2; k < columnaO; k++) {
                                System.out.print(" ");
                            }
                            System.out.println(character);
                        }
                    } 
                }

            }
            else{
                if(i < fila/2){
                    for (int j = i; j <= i; j++) {
                        System.out.print(character);
                        for (int j2 = 0; j2 < columnaS; j2++) {
                            System.out.print(" ");
                        }
                        System.out.print(character);
                        for (int j2 = 2; j2 < columnaO; j2++) {
                            System.out.print(" ");
                        }
                        System.out.println(character);   
                    }
                }
                else{
                    for (int j = i; j <= i; j++) {
                        for (int j2 = 1; j2 < columnaS; j2++) {
                            System.out.print(" ");
                        }
                        System.out.print(character + " " + character);
                        for (int j2 = 2; j2 < columnaO; j2++) {
                            System.out.print(" ");
                        }
                        System.out.println(character);
                    }
                }
            }
        }
    }
}
