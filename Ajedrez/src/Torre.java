public class Torre extends Piezas{

    public Torre(String color, String comportamiento, String patron, int velocidad) {
        super(color, comportamiento, patron, velocidad);
    }

    public Torre() {
    }

    @Override 
    public void crearInstanciacion(Piezas [] torresB, Piezas[] torresN) {
        
       for(int i=0; i < 2; i++){
            
            torresB[i]= new Torre("Blanco", "Homerica", " Directa", 3 );
            torresN[i]= new Torre("Negro", "Homerica", "Directa", 3 );
              
            } 
    }
    
    @Override
    public void Mover(){
        System.out.println("Directa");
    }

    
}
