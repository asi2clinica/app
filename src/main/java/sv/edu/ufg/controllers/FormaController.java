package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.FormaPago;
import sv.edu.ufg.service.FormaService;

@Controller
@RequestMapping(value={"/app/forma","/app/forma"})
public class FormaController {
		
	@Autowired FormaService formaService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("forma") FormaPago r){
		formaService.create(r);
		return model();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView create(@PathVariable("id") int id){
		formaService.delete(formaService.find(id));
		return model();
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id){
		ModelAndView model = model();
		model.addObject("forma", formaService.find(id));
		return model;
	}
	
	
	public ModelAndView model(){
		ModelAndView model = new ModelAndView("formas/list");
		model.addObject("forma", new FormaPago());
		model.addObject("formas", formaService.findAll());
		return model;
	}
	
	
}
