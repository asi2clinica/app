package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sv.edu.ufg.model.TipoDocumento;
import sv.edu.ufg.service.TipoDocumentoService;


@Controller
@RequestMapping(value="/app/tipodocumento",method=RequestMethod.GET)
public class TipoDocumentoController {
	
	@Autowired TipoDocumentoService tipodocumentoeService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("tipodocumento") TipoDocumento tipodocumento){
		tipodocumentoeService.create(tipodocumento);
		return "redirect:/app/tipodocumento";
	}
  
  
	@RequestMapping(value="/save/update",method=RequestMethod.POST)
	public String saveUpdate(@ModelAttribute("tipodocumento") TipoDocumento tipodocumento){
		tipodocumentoeService.update(tipodocumento);
		return "redirect:/app/tipodocumento";
	}
	
	@RequestMapping(value="view/{id}",method=RequestMethod.GET)
	public ModelAndView view(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("tipodocumento/view");
		model.addObject("tipodocumento", tipodocumentoeService.find(id));
		return model;
	}
	
	@RequestMapping(value="update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("tipodocumento/edit");
		model.addObject("tipodocumento", tipodocumentoeService.find(id));
		return model;
	}
	
	@RequestMapping(value="delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("tipodocumento/delete");
		tipodocumentoeService.delete(tipodocumentoeService.find(id));
		return "redirect:/app/tipodocumento";
	}
	
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView create(){
		ModelAndView model = model();
		model.setViewName("tipodocumento/create");
		return model;
	}
	
	private ModelAndView model(){
		ModelAndView model  = new ModelAndView("tipodocumento/list");
		TipoDocumento tipodocumento 	= new TipoDocumento();
		model.addObject("tipodocumentos", tipodocumentoeService.findAll());
		model.addObject("tipodocumento", tipodocumento);
		return model;
	}

}
