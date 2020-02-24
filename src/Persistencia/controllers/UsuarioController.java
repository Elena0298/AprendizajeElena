package Persistencia.controllers;

import Persistencia.daos.UsuarioDAO;
import Persistencia.entities.Usuario;

import java.util.List;

public class UsuarioController {

    UsuarioDAO usuarioDAO;

    public UsuarioController(){
        usuarioDAO = new UsuarioDAO();
    }

    public void crearUsuario(Usuario usuario){
        usuarioDAO.createUser(usuario);
    }

    public List<Usuario> obtenerTodosLosUsuarios(){
        return usuarioDAO.getAllUsers();
    }

    public int actualizarUsuario(Usuario usuario){
        return usuarioDAO.updateUser(usuario);
    }

    public Usuario obtenerUsuarioPorId(Long idUsuario){
        return usuarioDAO.getUserById(idUsuario);
    }

    public void borrarUsuario(Long idUsuario){
        usuarioDAO.deleteUserByUserId(idUsuario);
    }
}
