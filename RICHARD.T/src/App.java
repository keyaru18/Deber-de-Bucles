public class App {
    public static void main(String[] args) throws Exception {

        // declarar
        forInicialNombreR fin;
        forInicialApellidoT fit;
        forInicialNombreApellidoRT fina;
        whileInicialNombreR win;
        whileInicialApellidoT wit;
        whileInicialNombreApellidoRT wint;
        dowhileInicialNombreR din;
        dowhileInicialApellidoT dit;
        dowhileInicialNombreApellidoRT dint;

        // //instanciar
        fin = new forInicialNombreR();
        fit = new forInicialApellidoT();
        fina = new forInicialNombreApellidoRT();
        win = new whileInicialNombreR();
        wit = new whileInicialApellidoT();
        wint = new whileInicialNombreApellidoRT();
        din = new dowhileInicialNombreR();
        dit = new dowhileInicialApellidoT();
        dint = new dowhileInicialNombreApellidoRT();

        // llamar al metodo

        fin.drawR(5, 5, '#');
        fit.drawT(5, 5, '#');
        fina.drawRT(5, 5, '#');
        win.drawR(5, 5, '+');
        wit.drawT(5, 5, '+');
        wint.drawRT(5, 5, '+');
        din.drawR(5, 5, '*');
        dit.drawT(5, 5, '*');
        dint.drawRT(5, 5, '*');

    }
}
