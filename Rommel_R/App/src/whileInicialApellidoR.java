public class whileInicialApellidoR {
    public void drawR(int sizei, int sizej, char character) {
        System.out.println(" ");
        int i = 0;
        while (i < sizei) {
            int j = 0;
            while (j < sizej) {
                if ((j == 0 || (i == 0 && j < sizej - 1) || (i == sizei / 2 && j < sizej - 1)
                        || (j == sizej - 1 && i < sizei / 2 && i != 0) || (i == j && i > sizei / 2))) {
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