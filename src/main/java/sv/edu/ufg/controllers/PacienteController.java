package sv.edu.ufg.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Paciente;
import sv.edu.ufg.model.Persona;
import sv.edu.ufg.service.PacienteService;
import sv.edu.ufg.service.PersonaService;
import sv.edu.ufg.service.TipoPacienteService;

@Controller
@RequestMapping(value="/app/paciente",method=RequestMethod.GET)
public class PacienteController {
	
	
	Logger logger = Logger.getLogger(PacienteController.class);

	@Autowired PersonaService  personaService;
	@Autowired PacienteService pacienteService;
	@Autowired TipoPacienteService tipoPacienteService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
	
	@RequestMapping(value="/create",method=RequestMethod.GET)
	public ModelAndView create(){
		ModelAndView model = model();
		model.setViewName("paciente/create");
		return model;
	}
	
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public ModelAndView save(@ModelAttribute("paciente") Paciente paciente){
		ModelAndView model = model();
		model.setViewName("paciente/view");
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
