public class App {
    public static void main(String[] args) throws Exception {
                //declaracion For 
                For_Inicial_Nombre_S a;
                For_Inicial_Apellido_O b;
                For_Inicial_Nombre_Apellido_SO c;
        
                //declaracion While
                While_Inicial_Nombre_S d;
                While_Inical_Apellido_O e;
                While_Inicial_Nombre_Apellido_SO f;
        
                //declaracion DoWhile
                DoWhile_Inical_Nombre_S g;
                DoWhile_Inicial_Apellido_O h;
                DoWhile_Inicial_Nombre_Apellido_SO i;
        
                //instanciador For
                a = new For_Inicial_Nombre_S();
                b = new For_Inicial_Apellido_O();
                c = new For_Inicial_Nombre_Apellido_SO();
        
                //instanciador While
                d = new While_Inicial_Nombre_S();
                e = new While_Inical_Apellido_O();
                f = new While_Inicial_Nombre_Apellido_SO();
        
                //instanciador DoWhile
                g = new DoWhile_Inical_Nombre_S();
                h = new DoWhile_Inicial_Apellido_O();
                i = new DoWhile_Inicial_Nombre_Apellido_SO();
        
                //llamar al los metodos "for"
                a.F_InicialNombre(5,4,'*');
                b.F_InicalApellido(6,4,'*');
                c.F_NombreApellido(5,5,3,'*');
        
                //llamar al los metodos "while"
                d.W_Inicial_Nombre(5,5,'*');
                e.W_InicialApellido(6,4,'*');
                f.W_InicalNombreApellido(6,6,4,'*');
        
                //llamar al los metodo "DoWhile"
                g.Do_InicialNombre(5,4,'*');        
                h.Do_Inicial_Apellido(6,4,'*');
                i.Do_Inicial_Nombre_Apellido(7,7,5,'*');
    }
}
