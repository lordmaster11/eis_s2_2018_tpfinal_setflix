package setflix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import services.SeriesService;
import static org.junit.Assert.assertTrue;

public class SaveSeriesTest {
    private SeriesService mongoService;

    @Before
    public void setUp() {
        mongoService = new SeriesService();
        mongoService.crearSetDatosIniciales();
    }

    @After
    public void cleanUp(){
        mongoService.eliminarDatos();
    }

    @Test
    public void seriesGuardadas(){
        System.out.print(mongoService.todasLasSeries().get(0).getNombre());
        assertTrue(this.mongoService.todasLasSeries().size() == 11);
    }
}
