public class Mains {
      public static void main (String[] args){
        Peon [] peonesBlancos = new Peon [8];
        Peon [] peonesNegros = new Peon [8];
        Caballo [] caballosBlancos = new Caballo [2];
        Caballo [] caballosNegros = new Caballo [2];
        Torre [] torreBlancos = new Torre [2];
        Torre [] torreNegros = new Torre [2];
        Alfil [] alfilBlancos = new Alfil [2];
        Alfil [] alfilNegros = new Alfil [2];
        Reina [] reinaBlancos = new Reina [2];
        Reina [] reinaNegros = new Reina [2]; 
        Rey [] reyBlancos = new Rey [2];
        Rey [] reyNegros = new Rey [2];

        Peon nPeon = new Peon();
        nPeon.crearInstanciacion(peonesBlancos,peonesNegros);               
        Caballo nCaballo=new Caballo(); 
        nCaballo.crearInstanciacion(caballosBlancos,caballosNegros);    
        Torre nTorre= new Torre();
        nTorre.crearInstanciacion(torreBlancos, torreNegros);
        Alfil nAlfil= new Alfil();
        nAlfil.crearInstanciacion(alfilBlancos, alfilNegros);
        Reina nReina= new Reina();
        nReina.crearInstanciacion(reinaBlancos, reinaNegros);
        Rey nRey= new Rey();
        nRey.crearInstanciacion(reyBlancos, reyNegros);
       
        Piezas.imprimirPiezas(peonesBlancos);
        Piezas.imprimirPiezas(peonesNegros);
        Piezas.imprimirPiezas(caballosBlancos);
        Piezas.imprimirPiezas(caballosNegros); 
        Piezas.imprimirPiezas(torreBlancos);   
        Piezas.imprimirPiezas(torreNegros);  
        Piezas.imprimirPiezas(alfilBlancos); 
        Piezas.imprimirPiezas(alfilNegros);  
        Piezas.imprimirPiezas(reinaBlancos);       
        Piezas.imprimirPiezas(reinaNegros);
        Piezas.imprimirPiezas(reyBlancos);  
        Piezas.imprimirPiezas(reyNegros);
        Tablero.mostrarTablero();

        } 
    } 

    

