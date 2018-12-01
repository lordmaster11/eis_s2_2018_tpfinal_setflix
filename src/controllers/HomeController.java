package controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
		model.addAttribute("cant", 9);
		
		Usuario us = loginService.getUser(user);
		
		
		System.out.println(us.getApellido());
		
		
//		List<Serie> series = this.listaSeries.todasLasSeries();	
//        model.addAttribute("variable", series);
//		
        
	}
	
	
	/*
	@RequestMapping("/home")
    public String users(ModelMap model){
		List<Serie> series = this.listaSeries.todasLasSeries();	
        model.addAttribute("variable", series);
        return "home";
    }
	
	
	
	
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String inicio(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    return "home";
	}
	
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String series(Model model, @ModelAttribute("loginBean") Serie serie) throws Exception {		
	
			List<Serie> series = this.mongo.todasLasSeries();
			model.addAttribute("serie",serie.getNombre());
			model.addAttribute("serie",serie.getTemporadas());
			model.addAttribute("serie",serie.getGenero());
			
			return "home";
			
	
	  }
	
	*//*
	ArrayList<String> users = new ArrayList<String>();
	 
    public void addUsers(String name){
 
       
 
        this.users.add(name);
    }
 
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String users(ModelMap model){
 
        this.addUsers("1111");
        this.addUsers("2222");
 
        model.addAttribute("usuarios", this.users);
 
        return "home";
    }*/
	

	
	
	
	
	
	/*
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String init(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    return "home";
	}
	
	@RequestMapping("/home")
	public String series(Model model) {	
		List<Serie> seriesss = this.mongo.todasLasSeries();
		System.out.println(seriesss);

		model.addAttribute("series", seriesss);
		return "home";
	}*/
	
	
	
	/*
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String series(Model model, @ModelAttribute("loginBean") Serie serie) throws Exception {		
		List<Serie> seriesss = this.mongo.todasLasSeries();

		model.addAttribute("serie", serie.getNombre());
		model.addAttribute("serie", serie.getTemporadas());

		return "home";
	}
		*/	
}

