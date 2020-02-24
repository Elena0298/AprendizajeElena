package Excepciones;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Logger log = Logger.getLogger("ERROR MATEMATICO");

    public static void main(String[] args) {
       manejador();
    }

    public static void manejador(){
        try {

        }catch (ArrayIndexOutOfBoundsException e){
            log.log(Level.SEVERE, "Error: El indice no existe");
        }
    }
}
