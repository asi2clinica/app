package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Rol;
import sv.edu.ufg.service.RolService;

@Controller
@RequestMapping(value={"/app/roles"})
public class RolController {
	
	@Autowired RolService rolService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(ModelMap modelMap){	
		return model();
	}
	
	@RequestMapping(value="/report",method=RequestMethod.GET)
	public String report(ModelMap modelMap){
		return "roles/list";
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("rol") Rol rol){
		rolService.update(rol);
		return model();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id){
		
		rolService.delete((Rol)rolService.find(id));
		return model();
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id){
		ModelAndView model = model();
		model.addObject("rol",rolService.find(id));
		return model;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public ModelAndView save(@ModelAttribute("rol") Rol rol){
		rolService.update(rol);
		return model();
	}
	
	public ModelAndView model(){
		ModelAndView model = new ModelAndView("roles/list");
		model.addObject("rol",new Rol());
		model.addObject("roles",rolService.findAll());
		return  model;
	}
	
}
