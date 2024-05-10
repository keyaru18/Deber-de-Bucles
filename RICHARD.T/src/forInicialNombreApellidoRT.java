public class forInicialNombreApellidoRT {

    public void drawRT(int sizei, int sizej, char character) {
        System.out.println(" ");
        for (int i = 0; i < sizei; i++) {

            for (int j = 0; j < sizej; j++) {
                if ((j == 0 || (i == 0 && j < sizej - 1) || (i == sizei / 2 && j < sizej - 1)
                        || (j == sizej - 1 && i < sizei / 2 && i != 0) || (i == j && i > sizei / 2))) {
                    System.out.print(character + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");

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
