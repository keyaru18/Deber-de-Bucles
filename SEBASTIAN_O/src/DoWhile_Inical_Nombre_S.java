public class DoWhile_Inical_Nombre_S {
    public void Do_InicialNombre(int fila, int columna, char character){
        System.out.println();
        System.err.println("Metodo Do-While:");
        System.out.println();
        int i = 0;
        do 
        {
            if (i == 0 || i == fila/2 || i == fila-1) {
                int j=0;
                do
                {
                    System.out.print(character);
                    j++;
                }while(j < columna);
                System.out.println();
            }
            else{
                if(i < fila/2){
                    int j = i;
                    do{
                        System.out.println(character);
                        j++;
                    }while(j <= i);
                }
                else{
                    int j = i;
                    do{
                        int j2 = 1;
                        do {
                            System.out.print(" ");
                            j2++;
                        } while (j2 < columna);
                        System.out.println("*");
                        j++;
                    }while(j <= i);
                }
            }
            i++;
        }while(i < fila);
    }
}
