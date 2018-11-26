package model;

public class UsuarioDTO {
    private String usuario;
    private String password;

    public void setUsuario(String user) {
        this.usuario =user;
    }

    public void setContrasena(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getPassword() {
        return password;
    }
}
