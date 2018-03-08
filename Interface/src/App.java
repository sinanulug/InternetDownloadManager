
public class App {
    
    public static void main(String[] args) {
          
        Pc pc=new Pc(1, 4, 100);
        Telefon tel=new Telefon(2, 12, 2);
        doOp(pc);
        doOp(tel);        
        
    }
    public static void doOp(USB u)
    {
        u.tak();
        u.cikar();
        
    }
}
