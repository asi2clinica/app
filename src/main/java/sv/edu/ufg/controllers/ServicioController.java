package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Servicio;
import sv.edu.ufg.service.ServicioService;

@Controller
@RequestMapping(value={"/app/servicio","/app/servicio/"})
public class ServicioController {
	
	
	@Autowired ServicioService servicioService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("servicio") Servicio servicio){
		servicioService.create(servicio);
		return model();
	}
	
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id){
		servicioService.delete(servicioService.find(id));
		return model();
	}
	
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id){
		ModelAndView model = model();
		model.addObject("servicio", servicioService.find(id));
		return model;
	}
	
	
	public ModelAndView model(){
		ModelAndView model = new ModelAndView("servicio/list");
		model.addObject("servicio", new Servicio());
		model.addObject("servicios", servicioService.findAll());
		return model;
	}
}
