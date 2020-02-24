package Persistencia;

import Persistencia.configurations.Conexion;
import Persistencia.controllers.UsuarioController;
import Persistencia.entities.Usuario;

import java.util.List;
import java.util.Scanner;

public class Persistencia {
    public static void main(String[] args) {
        UsuarioController usuarioController = new UsuarioController();

        //Create
        /*Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String nombre = entrada.next();

        System.out.println("Ingrese el email");
        String email = entrada.next();

        System.out.println("Ingrese la contraseña");
        String password = entrada.next();

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(password);
        */

        //usuarioController.crearUsuario(usuario);

        //Read
        /*System.out.println("Contenido de la tabla usuarios");
        List<Usuario> usuarios = usuarioController.obtenerTodosLosUsuarios();
        for (int i = 0; i < usuarios.size(); i++){
            System.out.println("Nombre: "+usuarios.get(i).getNombre()+", Email: "+usuarios.get(i).getEmail()+", Contraseña: "+usuarios.get(i).getPassword());
        }*/

        //Update
        /*Usuario usuario = usuarioController.obtenerUsuarioPorId(1L);
        if (usuario != null) {
            usuario.setNombre("Salem");

            int res = usuarioController.actualizarUsuario(usuario);
            System.out.println(res);
        }*/

        //Delete
        usuarioController.borrarUsuario(1L);
    }
}
