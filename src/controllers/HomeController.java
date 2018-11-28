package controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.Serie;
import services.SeriesService;

@Controller
public class HomeController {
	SeriesService mongo = new SeriesService();
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String init(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    return "home";
	}
	
	@RequestMapping(value = "/home")
	public String series(Model model)  {	
		List<Serie> series = this.mongo.todasLasSeries();
		model.addAttribute("series", series);
		return "serie";
	}
}

