package services;

import setflix.Usuario;
import daos.GenericMongoDAO;

public class LoginService {


    GenericMongoDAO<Usuario> mongoDAO;


    public boolean login(Usuario usuario) {
        //se consigue la collecion que guarda los usuario y se setea al dao
        this.mongoDAO = new GenericMongoDAO<Usuario>(Usuario.class);
        // se guarda el usuario en la bbdd
        this.mongoDAO.save(usuario);
        // se recupera el documento usurio y se comparan sus nicknames
        return this.mongoDAO.itIsSaved(usuario.user).contains(usuario.user);
    }

    public boolean signUp(Usuario usuario) {
        return true;
    }
}
