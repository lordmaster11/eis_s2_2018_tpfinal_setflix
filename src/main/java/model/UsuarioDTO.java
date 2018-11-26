package model;

public class UsuarioDTO {
    private String usuario;
    private String contrasena;

    public void setUsuario(String user) {
        this.usuario =user;
    }

    public void setContrasena(String password) {
        this.contrasena = password;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
