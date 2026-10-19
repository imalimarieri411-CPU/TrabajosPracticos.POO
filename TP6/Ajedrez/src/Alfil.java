public class Alfil extends Piezas{

    public Alfil(String color, String comportamiento, String patron, int velocidad) {
        super(color, comportamiento, patron, velocidad);
    }

    public Alfil() {
    }
    @Override 
    public void crearInstanciacion(Piezas [] alfilB, Piezas[] alfilN) {
        
        for(int i=0; i < 2; i++){
            
            alfilB[i]= new Alfil("Blanco", "Sesgo", " Oblicuo", 3 );
            alfilN[i]= new Alfil("Negro", "Sesgo", "Oblicuo", 3 );
              
        } 
        
    }
    @Override
    public void Mover(){
        System.out.println("Oblicuo");
    }
}
