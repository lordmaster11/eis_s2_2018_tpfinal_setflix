package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Serie;
import services.LoginService;
import services.SeriesService;

@Controller
@RequestMapping()
public class SerieController {
	SeriesService seriesRepo = new SeriesService();
    LoginService loginService = new LoginService();

   @RequestMapping( "/{userid}/{someid}")
     public String goHome(Model model, 
    	@PathVariable(value="someid") String serie, @PathVariable(value="userid") String user ) throws Exception {
          
	   Serie serieSeleccionada = seriesRepo.getForName(serie);
 
	   	model.addAttribute("nombre",serieSeleccionada.getNombre());
	   	model.addAttribute("temporadas",serieSeleccionada.getTemporadas());
	   	model.addAttribute("genero",serieSeleccionada.getGenero());
	   	model.addAttribute("imagen",serieSeleccionada.getImagen());
	   	model.addAttribute("descripcion",serieSeleccionada.getDescripcion());
	   	model.addAttribute("trailer",serieSeleccionada.getTrailer());
		model.addAttribute("usuario",user);
		   
	    return "serie";
     }	
}

