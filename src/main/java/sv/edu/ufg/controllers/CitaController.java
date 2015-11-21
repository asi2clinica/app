package sv.edu.ufg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Cita;
import sv.edu.ufg.service.CitaService;
import sv.edu.ufg.service.DoctorService;
import sv.edu.ufg.service.EstadoCitaService;
import sv.edu.ufg.service.HorarioService;
import sv.edu.ufg.service.PacienteService;
import sv.edu.ufg.service.SecretariaService;
import sv.edu.ufg.service.SucursalService;

@Controller
@RequestMapping(value="/app/cita",method=RequestMethod.GET)
public class CitaController {
	
	@Autowired CitaService citaService;
        @Autowired SecretariaService secretariaService;
        @Autowired PacienteService pacienteService;
        @Autowired DoctorService doctorService;
        @Autowired SucursalService sucursalService;
        @Autowired HorarioService horarioService;
        @Autowired EstadoCitaService estadoCita;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView list(){
		return model();
	}
	
        @RequestMapping(value="/save",method=RequestMethod.GET)
	public String save(@ModelAttribute("cita") Cita cita){
		citaService.create(cita);
		return "redirect:/app/cita/view/"+cita.getId() ;
	}
       
        @RequestMapping(value="/save/update",method=RequestMethod.POST)
	public String saveUpdate(@ModelAttribute("paciente") Cita cita){
		citaService.update(cita);
		return "redirect:/app/cita/view/"+cita.getId() ;
	}
        
        @RequestMapping(value="view/{id}",method=RequestMethod.GET)
	public ModelAndView view(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("cita/view");
		model.addObject("cita", citaService.find(id));
		return model;
	}
        
        @RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id){
		ModelAndView model = model();
		model.setViewName("cita/update");
		model.addObject("cita",citaService.find(id));
		return model;
	}
        
        @RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id){
            ModelAndView model = model();
		model.setViewName("cita/delete");
		citaService.delete(citaService.find(id));		
		return model();
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("cita") Cita cita){
		ModelAndView model = model();
		model.setViewName("cita/create");
		return model;
	}
	
	private ModelAndView model(){
    		ModelAndView model = new ModelAndView("cita/list");
		model.addObject("cita",new Cita());
		model.addObject("citas", citaService.findAll());
		model.addObject("secretarias", secretariaService.findAll());
		model.addObject("doctores", doctorService.findAll());
		model.addObject("pacientes", pacienteService.findAll());
		model.addObject("sucursales", sucursalService.findAll());
		model.addObject("horarios", horarioService.findAll());
		model.addObject("estadosCita", estadoCita.findAll());
		return model;
	}
	
	
}
