public class Caballo extends Piezas {

    public Caballo(String color, String comportamiento, String patron, int velocidad) {
        super(color, comportamiento, patron, velocidad);
    }

    public Caballo() {
    }
    
    public void  crearInstanciacion(Piezas [] caballosB, Piezas [] caballosN){
        for(int i=0; i < 2; i++){
                
            caballosB[i]= new Caballo("Blanco", "Ligero", " ", 10 );
            caballosN[i]= new Caballo("Negro", "Ligero", " ", 10 );
                
        }   
    }
    @Override
    public void Mover(){
        System.out.println(" ");
    }
}
