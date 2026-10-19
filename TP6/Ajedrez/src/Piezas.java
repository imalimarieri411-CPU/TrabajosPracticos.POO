public abstract class Piezas {

    private String color;
    private String comportamiento;
    private String patron;
    private int velocidad;
    
  


    public Piezas(String color, String comportamiento, String patron, int velocidad) {
        this.color = color;
        this.comportamiento = comportamiento;
        this.patron = patron;
        this.velocidad = velocidad;
    }

    
    public Piezas() {
    }

///////////////////////////////////////////////////
    public abstract void Mover();

    
    
///////////////////////////////////////////////////    
    public abstract void crearInstanciacion(Piezas[] arr, Piezas [] arr2);
///////////////////////////////////////////////////
    public static void imprimirPiezas(  Piezas[] arreglo) {
        int cont = 1;
        for (Piezas p : arreglo) {
            if (p != null) {
                System.out.println(cont + ". " + p.toString());
                cont++;
            }
        }
        System.out.println("----------------------------------------------");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getColor() + 
            "(Comportamiento: " + getComportamiento() + 
            ", Movimiento: " + getPatron() +  ", Velocidad: " + getVelocidad()+")" ;
    }
   ///////////////////////////////////////////////////
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


}
