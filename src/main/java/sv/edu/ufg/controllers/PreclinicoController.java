/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ufg.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*
import sv.edu.ufg.model.Paciente;
import sv.edu.ufg.model.Pregunta;
import sv.edu.ufg.service.PacienteService;
import sv.edu.ufg.service.PreguntaService;
*/
import sv.edu.ufg.model.Preclinico;
import sv.edu.ufg.service.PreclinicoService;

/**
 *
 * @author Heraldo
 */
@Controller
@RequestMapping(value={"/app/preclinico","/app/preclinico/"},method=RequestMethod.GET)
public class PreclinicoController {

        /*
	@Autowired PacienteService pacienteService;
	@Autowired PreguntaService preguntaService;
        */
        @Autowired PreclinicoService preclinicoService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
        @RequestMapping(value={"/create","create"},method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("preclinico") Preclinico preclinico){
		preclinicoService.create(preclinico);
		return model();
	}
	
	public ModelAndView model(){
		ModelAndView model = new ModelAndView("preclinico/list");
		model.addObject("preclinico",preclinicoService.findAll());
		model.addObject("preclinico",new Preclinico());
		return model;
	}
}