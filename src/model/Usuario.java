package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;

    @JsonCreator
    public Usuario(@JsonProperty("usuario") String usuario,
                   @JsonProperty("password") String password,
                   @JsonProperty("nombre") String nombre,
                   @JsonProperty("apellido") String apellido){

        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Usuario(){}

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
