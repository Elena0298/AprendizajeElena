package Persistencia.daos;

import Persistencia.configurations.Conexion;
import Persistencia.entities.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class UsuarioDAO {

    public void createUser(Usuario usuario){
        try{
            Connection conn = Conexion.crearConexion();
            String query = "INSERT INTO usuarios (nombre, email, password) VALUES ( ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getPassword());
            preparedStatement.execute();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Usuario> getAllUsers() {
        try{
            Connection conn = Conexion.crearConexion();
            String query = "SELECT * FROM usuarios";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<Usuario> usuarios = new LinkedList<Usuario>();

            while(resultSet.next()){
                Usuario usuario = new Usuario();
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setPassword(resultSet.getString("password"));
                usuarios.add(usuario);
            }
            conn.close();
            return usuarios;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public int updateUser(Usuario usuario){
        try{
            Connection conn = Conexion.crearConexion();

            String query = "UPDATE usuarios SET nombre = ?, email = ?, password = ? WHERE usuarios.id_usuario = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setString(3, usuario.getPassword());
            preparedStatement.setLong(4, usuario.getIdUsuario());
            int res = preparedStatement.executeUpdate();

            conn.close();
            return res;
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    public Usuario getUserById(Long idUser){
        try {
            Connection conn = Conexion.crearConexion();
            String query = "SELECT * FROM usuarios WHERE usuarios.id_usuario = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setLong(1, idUser);
            ResultSet resultSet = preparedStatement.executeQuery();
            Usuario usuario = new Usuario();
            while (resultSet.next()){
                usuario.setIdUsuario(resultSet.getLong("id_usuario"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setPassword(resultSet.getString("password"));
            }
            conn.close();
            return usuario;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void deleteUserByUserId(Long idUsuario){
        try {
            Connection conn = Conexion.crearConexion();
            String query = "DELETE FROM usuarios WHERE usuarios.id_usuario = ?";

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setLong(1, idUsuario);
            preparedStatement.execute();

            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
