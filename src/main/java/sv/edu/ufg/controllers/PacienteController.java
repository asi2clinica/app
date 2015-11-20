package sv.edu.ufg.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Paciente;
import sv.edu.ufg.model.Persona;
import sv.edu.ufg.service.PacienteService;
import sv.edu.ufg.service.TipoPacienteService;

@Controller
@RequestMapping(value="/app/paciente",method=RequestMethod.GET)
public class PacienteController {



	@Autowired PacienteService pacienteService;
	@Autowired TipoPacienteService tipoPacienteService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("paciente") Paciente paciente){
		pacienteService.create(paciente);
		return "redirect:/app/paciente/view/"+paciente.getId() ;
	}
  
  
	@RequestMapping(value="/save/update",method=RequestMethod.POST)
	public String saveUpdate(@ModelAttribute("paciente") Paciente paciente){
		pacienteService.update(paciente);
		return "redirect:/app/paciente/view/"+paciente.getId() ;
	}
	
	
	
	
	@RequestMapping(value="view/{id}",method=RequestMethod.GET)
	public ModelAndView view(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("paciente/view");
		model.addObject("paciente", pacienteService.find(id));
                model.addObject("tipopaciente", tipoPacienteService.find(id));
		return model;
	}
	
	
	@RequestMapping(value="update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("paciente/edit");
		model.addObject("paciente", pacienteService.find(id));
		return model;
	}
	
	@RequestMapping(value="delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("paciente/delete");
		pacienteService.delete(pacienteService.find(id));
		return model;
	}
	
	
	
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView create(){
		ModelAndView model = model();
		model.setViewName("paciente/create");
		return model;
	}
	
	private ModelAndView model(){
		ModelAndView model  = new ModelAndView("paciente/list");
		Paciente paciente 	= new Paciente();
		paciente.setPersona(new Persona());
		model.addObject("pacientes", pacienteService.findAll());
		model.addObject("tipoPacientes", tipoPacienteService.findAll());
		model.addObject("paciente", paciente);
		return model;
	}
	
}
