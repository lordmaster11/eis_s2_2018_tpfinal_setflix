package services;

import setflix.Usuario;
import daos.GenericMongoDAO;

public class LoginService {


    GenericMongoDAO<Usuario> mongoDAO;


    public boolean login(Usuario usuario) {
        //se consigue la collecion que guarda los usuario y se setea al dao
        this.mongoDAO = new GenericMongoDAO<Usuario>(Usuario.class);
        // se recupera el documento usurio y se comparan sus nicknames
        return this.mongoDAO.itIsSaved("user",usuario.user).contains(usuario.user);
    }

    public boolean signUp(Usuario usuario) {
        //se consigue la collecion que guarda los usuario y se setea al dao
        this.mongoDAO = new GenericMongoDAO<Usuario>(Usuario.class);
        //se registra un usuario nuevo
        this.mongoDAO.save(usuario);
        // se recuperan los datos ingresados
        return this.mongoDAO.itIsSaved("nombre",usuario.nombre).contains(usuario.nombre) &&
                this.mongoDAO.itIsSaved("apellido",usuario.apellido).contains(usuario.apellido) &&
                this.mongoDAO.itIsSaved("user",usuario.user).contains(usuario.user) &&
                this.mongoDAO.itIsSaved("password",usuario.password).contains(usuario.password);
    }
}
