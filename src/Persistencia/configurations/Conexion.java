package Persistencia.configurations;

import Persistencia.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String NOMBRE_BD = "escuela_test";
    private static final String NOMBRE_USUARIO_BD = "root";
    private static final String CONTRASENIA_BD = "";

    public static Connection crearConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+NOMBRE_BD, NOMBRE_USUARIO_BD, CONTRASENIA_BD);
            System.out.println("Conexión exitosa");
            return  connection;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
