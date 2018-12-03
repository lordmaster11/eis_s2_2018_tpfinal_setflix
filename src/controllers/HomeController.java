package controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.Serie;
import model.Usuario;
import services.LoginService;
import services.SeriesService;

@Controller
@RequestMapping()
public class HomeController {
	SeriesService seriesRepo = new SeriesService();
    LoginService loginService = new LoginService();
	
	@RequestMapping(value = "/{someID}", method = RequestMethod.GET)
	public void init(Model model, 
			@PathVariable(value="someID") String id, String user) {
		
		List<Serie> series = seriesRepo.todasLasSeries();
		
		model.addAttribute("us", user);
		model.addAttribute("variable", series);
		
		Usuario us = loginService.getUser(user);
	}
}