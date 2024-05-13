public class dowhileInicialNombreR {
    public void drawR(int sizei, int sizej, char character) {
        System.out.println(" ");
        int i = 0;
        do {
            int j = 0;
            do {
                if ((j == 0 || (i == 0 && j < sizej - 1) || (i == sizei / 2 && j < sizej - 1)
                        || (j == sizej - 1 && i < sizei / 2 && i != 0) || (i == j && i > sizei / 2))) {
                    System.out.print(character + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < sizej);
            System.out.println();
            i++;
        } while (i < sizei);
    }
}