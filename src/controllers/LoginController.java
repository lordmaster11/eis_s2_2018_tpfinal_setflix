package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Usuario;
import services.LoginService;

@Controller
public class LoginController {
	LoginService mongo = new LoginService();
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String init(Model model) {
	    model.addAttribute("msg", "Please Enter Your Login Details");
	    return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") Usuario usuario) throws Exception {		
		if(usuario.getUsuario() == "" && usuario.getPassword()== "" ){
			model.addAttribute("error", "Ingrese Usuario y Contraseña"); 
			return "login";
		}else if(usuario.getUsuario() == "" && usuario.getPassword() != "") {
			model.addAttribute("error", "Ingrese Usuario");
			return "login";
		}else if(usuario.getUsuario() != "" && usuario.getPassword() == "") {
			model.addAttribute("error","Ingrese Contraseña");
			return "login";
		}

		try{
			Usuario user = this.mongo.login(usuario.getUsuario(), usuario.getPassword());
			model.addAttribute("user",user.getUsuario());
			return "home";
			
		}catch(IndexOutOfBoundsException e){
			model.addAttribute("error","El usuario no existe");
	    	return "login";
		}
	  }
	
	@RequestMapping(value = "/login/registrar", method = RequestMethod.GET)
	public String showRegistrationForm(Model model)  {
		model.addAttribute("msg", "Please Enter Your Login Details");
	    return "registrar";
	}
	
	@RequestMapping(value = "login/registrar",method = RequestMethod.POST)
	public String registrar(Model model, @ModelAttribute("loginBean") Usuario usuario) throws Exception {		
		if(usuario.getUsuario() == "" && usuario.getPassword()== "" && usuario.getNombre() == "" && usuario.getApellido() == ""){
			model.addAttribute("error", "Ingrese los datos"); 
			return "registrar";
		}else if(usuario.getUsuario() == "" && usuario.getPassword() != "" && usuario.getNombre() != "" && usuario.getApellido() != "") {
			model.addAttribute("error", "Ingrese Usuario");
			return "registrar";
		}else if(usuario.getUsuario() != "" && usuario.getPassword() == "" && usuario.getNombre() != "" && usuario.getApellido() != "") {
			model.addAttribute("error","Ingrese Contraseña");
			return "registrar";
		}else if(usuario.getUsuario() != "" && usuario.getPassword() != "" && usuario.getNombre() == "" && usuario.getApellido() != "") {
			model.addAttribute("error","Ingrese Nombre");
			return "registrar";
		}else if(usuario.getUsuario() != "" && usuario.getPassword() != "" && usuario.getNombre() != "" && usuario.getApellido() == "") {
			model.addAttribute("error","Ingrese Apellido");
			return "registrar";
		}else if(usuario.getUsuario() != "" && usuario.getPassword() == "" && usuario.getNombre() == "" && usuario.getApellido() == "") {
			model.addAttribute("error", "Ingrese todos los datos");
			return "registrar";
		}	

		try{
			Usuario user = this.mongo.registrar(usuario);
			model.addAttribute("user",user.getUsuario());
			return "home";
			
		}catch(Exception e){
			model.addAttribute("error","El usuario ya existe");
	    	return "registrar";
		}	
	  }
}
