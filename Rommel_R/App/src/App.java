public class App {
    public static void main(String[] args) throws Exception {
        forInicialNombreR fin;
        forInicialApellidoR fir;
        forInicialNombreApellidoRR fina;
        whileInicialNombreR win;
        whileInicialApellidoR wit;
        whileInicialNombreApellidoRR wint;
        dowhileInicialNombreR din;
        dowhileInicialApellidoR dit;
       dowhileInicialNombreApellidoRR dint;
        
        
        fin = new forInicialNombreR();
        fir = new forInicialApellidoR();
        fina = new forInicialNombreApellidoRR();
        win = new whileInicialNombreR();
        wit = new whileInicialApellidoR();
        wint = new whileInicialNombreApellidoRR();
        din = new dowhileInicialNombreR();
        dit = new dowhileInicialApellidoR();
        dint = new dowhileInicialNombreApellidoRR();
        
        
        fin.drawP(5, 5, '#');
        fir.drawT(5, 5, '#');
        fina.drawRT(5, 5, '#');
        win.drawR(5, 5, '+');
        wit.drawR(5, 5, '+');
        wint.drawRT(5, 5, '+');
        din.drawR(5, 5, '%');
        dit.drawR(5, 5, '%');
        dint.drawR(5, 5, '%');

        

    
    
    
    }






}
