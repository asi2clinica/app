/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ufg.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Pregunta;
import sv.edu.ufg.service.PreguntaService;

/**
 *
 * @author Heraldo
 */
@Controller
@RequestMapping(value={"/app/pregunta","/app/pregunta/"},method=RequestMethod.GET)
public class PreguntaController {
	
	@Autowired PreguntaService preguntaService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
	@RequestMapping(value={"/create","create"},method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("pregunta") Pregunta pregunta){
		preguntaService.create(pregunta);
		return model();
	}
	
	public ModelAndView model(){
		ModelAndView model = new ModelAndView("pregunta/list");
		model.addObject("pregunta",preguntaService.findAll());
		model.addObject("pregunta",new Pregunta());
		return model;
	}

}