package dummies;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class RepositorioUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public RepositorioUsuarios(){
        //0
        Usuario usuario1 = new Usuario("Marcelo", "1234", "jmdicostanzo11@gmail.com");

        //1
        Usuario usuario2 = new Usuario("Cesar", "1234", "cesar@gmail.com");

        //2
        Usuario usuario3 = new Usuario("Rodrigo", "1234", "rodrigo@gmail.com");

        //3
        Usuario usuario4 = new Usuario("Oscar", "1234", "oscar@gmail.com");

        //4
        Usuario usuario5 = new Usuario("Nicolas", "1234", "nicolas@gmail.com");

        //5
        Usuario usuario6 = new Usuario("Fernando", "1234", "fernando@gmail.com");


        usuarios.add(usuario1);usuarios.add(usuario2);usuarios.add(usuario3);
        usuarios.add(usuario4);usuarios.add(usuario5);usuarios.add(usuario6);
    }

    public List<Usuario> getUsuarios() { return usuarios; }
}

