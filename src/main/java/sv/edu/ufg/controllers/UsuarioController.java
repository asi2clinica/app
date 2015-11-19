package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Usuario;
import sv.edu.ufg.service.RolService;

@Controller
@RequestMapping(value={"/app/usuario/","app/usuario"})
public class UsuarioController {
	
	@Autowired RolService rolService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
	
	
	public ModelAndView model(){
		ModelAndView model = new ModelAndView("usuario/list");
		model.addObject("roles", rolService.findAll());
		model.addObject("usuario", new Usuario());
		return model;
	}
	
}
