package services;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import daos.GenericMongoDAO;
import daos.MongoConnection;
import dummies.UsuarioRepositorio;
import model.Serie;
import model.Usuario;

import java.util.List;

public class LoginService extends GenericMongoDAO<Serie> {
    private Jongo jongo;
    private MongoCollection registros;
    private UsuarioRepositorio usuarios;
    
    public LoginService() {
        jongo = MongoConnection.getInstance().getJongo();
        registros  = jongo.getCollection("usuario");
        usuarios = new UsuarioRepositorio();
    }

    public Usuario login(String user, String pass) throws Exception {
    	List<Usuario> usuario = copyToList(registros.find("{usuario: #, password:#}",
                user, pass).as(Usuario.class));
           	
    	return usuario.get(0);        
    }

    public Usuario registrar(Usuario user ) throws Exception {   	
    	List<Usuario> usuarios = copyToList(registros.find("{usuario: #}",
                user.getUsuario()).as(Usuario.class));
    	
    	if(usuarios.size() == 0) {    		
    		registros.save(user);
    	} else{
            throw new Exception("El usuario ya existe");
        }
		return user;
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
