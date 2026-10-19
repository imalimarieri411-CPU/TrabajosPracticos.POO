import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        Reina [] reinaBlancos = new Reina [1];
        Reina [] reinaNegros = new Reina [1]; 
        Rey [] reyBlancos = new Rey [1];
        Rey [] reyNegros = new Rey [1];

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
        
        recorrerArr(peonesBlancos);
        recorrerArr(peonesNegros);
        recorrerArr(caballosBlancos);
        recorrerArr(caballosNegros);
        recorrerArr(torreBlancos);
        recorrerArr(torreNegros);
        recorrerArr(alfilBlancos);
        recorrerArr(alfilNegros);
        recorrerArr(reinaBlancos);
        recorrerArr(reinaNegros);
        recorrerArr(reyBlancos);
        recorrerArr(reyNegros);
        mostrarPiezasBD();
}

public static int obtenerIdColor(Piezas p){
  int id=0;
  if (p.getColor()=="Negro"){
    id=2;
  }else{
    id=1;
  }
  return id;
}  

public static int obtenerIdPieza( Piezas p){

  int id=0;
  if (p.getClass().getSimpleName()=="Reina"){
    id =1;
  }else if (p.getClass().getSimpleName()=="Rey"){
    id = 2;
  }else if (p.getClass().getSimpleName()=="Torre"){
    id = 3;
  }else if (p.getClass().getSimpleName()=="Alfil"){
    id = 4;
  }else if (p.getClass().getSimpleName()=="Caballo"){
    id = 5;
  }else if (p.getClass().getSimpleName()=="Peon"){
    id = 6;
  }else{
    System.out.println("Pieza no valida");
  }
  return id;
}
   
public static void InsertarPieza(Piezas p){
   String sql = "INSERT INTO PIEZA (IDTIPOPIEZA, DESCRIPCION, MOVIMIENTO, COMPORTAMIENTO, VELOCIDAD, IDCOLOR) VALUES (?, ?, ?, ?, ?, ?)";
    try (Connection conexion = new AccesoDatos().getConexion();
         PreparedStatement stmt = conexion.prepareStatement(sql)) {

        // Obtener los IDs necesarios
        int idColor = obtenerIdColor(p);
        int idTipoPieza = obtenerIdPieza(p);
        String descr=p.getClass().getSimpleName()+" "+p.getColor();
        // Asignar los parámetros en la consulta
        stmt.setInt(1, idTipoPieza);
        stmt.setString(2,descr);
        stmt.setString(3, p.getPatron());
        stmt.setString(4, p.getComportamiento());
         stmt.setInt(5, p.getVelocidad());
        stmt.setInt(6, idColor);

        stmt.executeUpdate();
        System.out.println("Pieza insertada con éxito.");
    } catch (SQLException e) {
        System.err.println("Error al insertar la pieza.");
        e.printStackTrace();
    }
}
public static void mostrarPiezasBD()
	{
		
		//Objeto para ejecutar la consulta en la base de datos
    AccesoDatos accesoBD = null;
    Connection con = null;
    Statement sentencia = null;
		ResultSet rs = null;
		
		
		// Se crea la consulta usando lenguaje SQL Estandar y almacenando en la variable query
		String query ="select idPieza, \r\n" + //
            "TP.DescripciondePieza as TipoPieza , \r\n" + //
            "C.Descripcion as Color, \r\n" + //
            "P.Descripcion as ResumenPieza, \r\n" + //
            "Posicion, \r\n" + //
            "Movimiento, \r\n" + //
            "Comportamiento, \r\n" + //
            "Velocidad \r\n" + //
            "from Pieza P inner join tipopieza TP on P.idtipoPieza = TP.idtipoPieza\r\n" + //
            "inner join Color C on P.idColor = C.idColor";

        //En este bloque se ejecutan las sentencias necesarias para acceder a la BD y obtener la informacion
        try {
        	// Instancio un objeto de acceso a datos
        	accesoBD = new AccesoDatos();
			
            //Obtener la conexion para poder generar la sentencia de consulta
            con = accesoBD.getConexion();
            sentencia = con.createStatement();
            
            //Ejecuta la consulta y almacena el resultado en rs
            rs  = sentencia.executeQuery(query);
            
            // Procesa el resultSet y muestra la informacion obtenida desde la BD
            while(rs.next()){
            	
            int idPieza = rs.getInt("IDPIEZA");
            		System.out.println("Pieza Nro: " + String.valueOf(idPieza)
                    + ", Tipo: " + rs.getString("TipoPieza") + ", Color: " + rs.getString("Color")
                    + ", Movimiento: " + rs.getString("MOVIMIENTO")
                    + ", Comportamiento: " + rs.getString("COMPORTAMIENTO") + ", Velocidad: " + rs.getInt("VELOCIDAD"));         			
			}    
            
                     
 
        } catch (SQLException e) {
            System.err.println("Error al CARGAR DATOS");
        }
       finally
        {
        	try
        	{
        		// Cierra el ResultSet
        		if (rs!= null) rs.close();
        		// Cierra la sentencia
        		if (sentencia!= null) sentencia.close();
        		// Cierra la conexion
        		if (con != null) con.close();
        		
        	}catch (SQLException e)
        	{
        		System.err.println("Error al cerrar conexion");
        	}
        }
	}
public static void recorrerArr(Piezas arr[]){
  for(Piezas p:arr){
    InsertarPieza(p);
  }
}
  
}
