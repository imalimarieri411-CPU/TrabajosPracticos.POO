public class Peon extends Piezas {

    public Peon(String color, String comportamiento, String patron, int velocidad) {
        super(color, comportamiento, patron, velocidad);
    }

    public Peon() {
    }
    @Override 
    public void crearInstanciacion(Piezas [] peonesB, Piezas[] peonesN) {
        
         for(int i=0; i < 8; i++){
            
            peonesB[i]= new Peon("Blanco", "Agresivo", "Ladino", 2 );
            
            peonesN[i]= new Peon("Negro", "Agresivo", "Ladino", 2 );    
       }
        
    }
    @Override
    public void Mover(){
        System.out.println("Ladino");
    }

    
}
