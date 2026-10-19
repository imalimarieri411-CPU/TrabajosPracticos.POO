public class Reina extends Piezas {

    public Reina(String color, String comportamiento, String patron, int velocidad) {
        super(color, comportamiento, patron, velocidad);
    }

    public Reina() {
    }

    @Override 
    public void crearInstanciacion(Piezas [] reinaB, Piezas[] reinaN) {
        
      for(int i=0; i < 1; i++){
            
            reinaB[i]= new Reina("Blanco", "Armada", "Encarnizada", 6 );
            reinaN[i]= new Reina("Negro", "Armada", "Encarnizada", 6 );
              
        }
        
    }

    @Override
    public void Mover(){
        System.out.println("Encarnizada");
    }
    
    
    
}
