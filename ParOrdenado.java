/**
 *Tarea 10 del practico N1 (rama master)
 */
public class ParOrdenado {
    
    private int primerComponente;
    private int segundoComponente;
    
    
    /**
     * Constructor for objects of class ParOrdenado
     */
    public ParOrdenado()
    {
        primerComponente = 0;
        segundoComponente = 0;
    
    }
    
    public void cambiarPrimerComponete(int x){
        primerComponente = x;
    }
        public void cambiarSegundoComponente(int y){
        segundoComponente = y;
    }
    
        public int primerComponente(){
        return primerComponente;
    }
    
    public int getSegundoComponente(){
        return segundoComponente;
    }


}
