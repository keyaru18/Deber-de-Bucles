public class dowhileInicialApellidoT {
    public void drawT(int sizei, int sizej, char character) {
        System.out.println(" ");
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0 || j == sizej - 3) {
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
