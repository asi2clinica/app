package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Cita;
import sv.edu.ufg.service.CitaService;

@RequestMapping(value="/app/citas")
public class CitaController {
	
	@Autowired CitaService citaService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index(){
		return model();
	}
	
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("cita") Cita cita){
		citaService.create(cita);
		return model();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id){
		citaService.delete(citaService.find(id));		
		return model();
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("cita/update");
		model.addObject("cita",citaService.find(id));
		return model;
	}
	
	
	
	private ModelAndView model(){
		ModelAndView model = new ModelAndView("/cita/list");
		model.addObject("cita",new Cita());
		model.addObject("citas", citaService.findAll());
		return model;
	}
	
	
}
