package services;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import daos.GenericMongoDAO;
import daos.MongoConnection;
import dummies.SerieRepositorio;
import model.Serie;
import model.Usuario;

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

	public Serie getForName(String serie) {
		List<Serie> series = copyToList(registros.find("{nombre: #}",
				serie).as(Serie.class));
    	
		return series.get(0);
	}
}