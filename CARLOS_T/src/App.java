public class App {
    public static void main(String[] args) throws Exception {
        forInicialNombreC forC;
        forInicialApellidoT forT;
        forInicialNombreApellidoCT forCT;
        whileInicialNombreC whileC;
        whileInicialApellidoT whileT;
        whileInicialNombreApellidoCT whileCT;
        doWhileInicialNombreC doWhileC;
        doWhileInicialApellidoT doWhileT;
        doWhileInicialNombreApellidoCT doWhileCT;

        forC = new forInicialNombreC();
        forT = new forInicialApellidoT();
        forCT = new forInicialNombreApellidoCT();
        whileC = new whileInicialNombreC();
        whileT = new whileInicialApellidoT();
        whileCT = new whileInicialNombreApellidoCT();
        doWhileC = new doWhileInicialNombreC();
        doWhileT = new doWhileInicialApellidoT();
        doWhileCT = new doWhileInicialNombreApellidoCT();

        forC.imprimirTamanioCaracter(5);
        forT.imprimirTamanioCaracter(5);
        forCT.imprimirTamanioCaracter(5);
        whileC.imprimirTamanioCaracter(5);
        whileT.imprimirTamanioCaracter(5);
        whileCT.imprimirTamanioCaracter(5);
        doWhileC.imprimirTamanioCaracter(5);
        doWhileT.imprimirTamanioCaracter(5);
        doWhileCT.imprimirTamanioCaracter(5);
    }
}
