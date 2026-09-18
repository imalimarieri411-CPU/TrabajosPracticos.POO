public class Rey extends Piezas{

    public Rey(String color, String comportamiento, String patron, int velocidad) {
        super(color, comportamiento, patron, velocidad);
    }

    public Rey() {
    }
    
    @Override 
    public void crearInstanciacion(Piezas [] reyB, Piezas[] reyN) {
        
      for(int i=0; i < 1; i++){
            
            reyB[i]= new Rey("Blanco", "Postrero", "Tenue", 4 );
            reyN[i]= new Rey("Negro", "Postrero", "Tenue", 4 );
              
        }
        
    }
    
    @Override
    public void Mover(){
        System.out.println("Tenue");
    }
    
}
