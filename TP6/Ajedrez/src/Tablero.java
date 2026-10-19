public class Tablero {
    private Casillero[][]  nuevoTablero  ;

    public Tablero ()
    {
        nuevoTablero= new Casillero[8][8];
    }

    public Casillero[][] getNuevoTablero() {
        return nuevoTablero;
    }

    public void setNuevoTablero(Casillero[][] nuevoTablero) {
        this.nuevoTablero = nuevoTablero;
    
    }
    
    
    public static void mostrarTablero(){
        int fila, colum;
        for(fila = 0; fila < 8; fila++){
            for(colum = 0; colum < 8; colum++){     
            
                if ((fila + colum) % 2 == 0) {
                    System.out.print("[B] ");  // Casillero blanco
                } else {
                    System.out.print("[N] ");  // Casillero negro
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
