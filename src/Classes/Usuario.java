/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Onecas Walter Benedito
 */
public class Usuario {
    private String nome;      // Nome do usuário
    private String username;  // Nome de login (único)
    private String senha;     // Senha do usuário
    private String tipo;      // Tipo de usuário: "admin" ou "normal"

    // Construtor
    public Usuario(String nome, String username, String senha, String tipo) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.tipo = tipo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para verificar se a senha está correta
    public boolean autenticar(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

    // Método para verificar se o usuário é administrador
    public boolean isAdmin() {
        return "admin".equalsIgnoreCase(this.tipo);
    }

    // Método para exibir informações do usuário
    @Override
    public String toString() {
        return "Nome: " + nome + ", Username: " + username + ", Tipo: " + tipo;
    }
}
