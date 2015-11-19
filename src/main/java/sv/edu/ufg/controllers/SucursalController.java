package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sv.edu.ufg.model.Sucursal;
import sv.edu.ufg.service.SucursalService;

@Controller
@RequestMapping(value={"/app/sucursal","/app/sucursal/"})
public class SucursalController {
	
	@Autowired SucursalService sucursalService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(ModelMap model){
		return model();
	}
	
	@RequestMapping(value={"/create","create"},method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("sucursal") Sucursal sucursal){
		sucursalService.create(sucursal);
		return model();
	}
	
	
	
	
	
	
	
	
	public ModelAndView model(){
		ModelAndView model = new ModelAndView("sucursal/list");
		model.addObject("sucursale",sucursalService.findAll());
		model.addObject("sucursal",new Sucursal());
		return model;
	}

}
