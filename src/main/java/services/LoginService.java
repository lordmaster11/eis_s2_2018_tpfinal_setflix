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

    public boolean login(String user, String pass) throws Exception {
        if (this.registros.find("{usuario: #, contrasena:#}",
                user, pass).as(Usuario.class).count() > 0) {
            return true;
        } else {
             throw new Exception("El usuario no existe, ingrese Usuario y Password correctamente por favor");
        }
    }

    public void registrar(Usuario usuario) throws Exception {
        if((this.registros.find("{usuario: #}",
                usuario.getUsuario())
                .as(Usuario.class)).count() == 0 ) {
            registros.save(usuario);
        } else{
            throw new Exception("El usuario ya existe");
        }
    }

    public void crearSetDatosIniciales() {
        for (Usuario usuario: usuarios.getUsuarios()) {
            registros.save(usuario);
        }
    }

    public void eliminarDatos() {
        registros.drop();
    }

    public List<Usuario> getUsuarios() {
        return (copyToList(registros.find().as(Usuario.class)));
    }
}
