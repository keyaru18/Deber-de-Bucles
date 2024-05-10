public class whileInicialApellidoT {
    public void drawT(int sizei, int sizej, char character) {
        System.out.println(" ");
        int i = 0;
        while (i < sizei) {
            int j = 0;
            while (j < sizej) {
                if (i == 0 || j == sizej - 3) {
                    System.out.print(character + " ");
                } else {
                    System.out.print("  ");
                }
               j++; 
            }
            System.out.println();
            i++;
        }
    }
}

