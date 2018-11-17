package services;

import daos.GenericMongoDAO;
import daos.MongoConnection;
import dummies.UsuarioRepositorio;
import model.Serie;
import model.Usuario;
import model.UsuarioDTO;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.List;

public class LoginService extends GenericMongoDAO<Serie> {

    private Jongo jongo = MongoConnection.getInstance().getJongo();
    private MongoCollection registros  = jongo.getCollection("usuario");
    private UsuarioRepositorio usuarios = new UsuarioRepositorio();

    public boolean login(UsuarioDTO usuario) {

        return ((this.registros.find("{usuario: #, contrasena:#}",
                usuario.getUsuario(), usuario.getContrasena())
                .as(Usuario.class)).count() > 0 );
    }

    public boolean signUp(Usuario usuario) {


        boolean res = false;
        if((registros.count("{usuario: #}",
                usuario.getUsuario())) == 0){
            registros.insert(usuario);
            res = true;
        }
        return res;
    }

    public void crearSetDatosIniciales() {
        for (Usuario usuario: usuarios.getUsuarios()) {
            registros.insert(usuario);
        }
    }

    public void eliminarDatos() {
        registros.drop();
    }

    public List<Usuario> getUsuarios() {
        return (copyToList(registros.find().as(Usuario.class)));
    }
}
