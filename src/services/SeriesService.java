package services;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import daos.GenericMongoDAO;
import daos.MongoConnection;
import dummies.SerieRepositorio;
import model.Serie;

import java.util.List;

public class SeriesService extends GenericMongoDAO<Serie> {
    private Jongo jongo = MongoConnection.getInstance().getJongo();
    private MongoCollection registros  = jongo.getCollection("serie");
    private SerieRepositorio seriesRepository = new SerieRepositorio();

    public void crearSetDatosIniciales() {
        for (Serie serie : seriesRepository.getSeries()) {
            registros.save(serie);
        }
    }

    public List<Serie> todasLasSeries(){
        return (copyToList(registros.find().as(Serie.class)));
    }

    public void eliminarDatos() {
        registros.drop();
    }
}