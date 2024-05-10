public class forInicialApellidoT {
    public void drawT(int sizei, int sizej, char character) {
        System.out.println(" ");
        for (int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                if (i == 0 || j == sizej - 3) {
                    System.out.print(character + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
