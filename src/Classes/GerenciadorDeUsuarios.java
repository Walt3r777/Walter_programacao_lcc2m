/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author lidiomanuel
 */
import java.util.ArrayList;

public class GerenciadorDeUsuarios {
    private ArrayList<Usuario> usuarios;

    public GerenciadorDeUsuarios() {
        usuarios = new ArrayList<>();
        // Adiciona um administrador padrão
        usuarios.add(new Usuario("Administrador", "admin", "1234", "admin"));
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario autenticar(String username, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.autenticar(senha)) {
                return usuario;
            }
        }
        return null;
    }
}