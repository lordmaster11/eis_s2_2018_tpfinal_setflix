package model;

import services.LoginService;
import services.SeriesService;

public class Started {
	public static void main(String[] args) {
			
		LoginService loginService = new LoginService();
		SeriesService serieService = new SeriesService();
			
		//loginService.deleteAll();
		//serieService.deleteAll();
		
		loginService.crearSetDatosIniciales();
		serieService.crearSetDatosIniciales();
	}
}

