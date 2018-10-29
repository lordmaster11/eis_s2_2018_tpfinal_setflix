package model;

import setflix.App;

public class Usuario {
    String usuario;
    String password;
    String mail;

    public Usuario(String user, String pass, String mail) {
        this.usuario = user;
        this.password = pass;
        this.mail = mail;
    }

    App a = new App();
}
