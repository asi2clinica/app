package sv.edu.ufg.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Factura;
import sv.edu.ufg.service.CitaService;
import sv.edu.ufg.service.FacturaService;


@Controller
@Scope(value="session")
@RequestMapping(value={"/app/facturacion","/app/facturacion/"})
public class FacturacionController implements Serializable{
  
		private static final long serialVersionUID = 1L;

		Factura factura = new Factura();
	
  		@Autowired   FacturaService facturaService;
  		@Autowired   CitaService    citaService;
  
  		@RequestMapping(method=RequestMethod.GET)
  		public ModelAndView list(){    	  
  			return model();
  		}
  
  		@RequestMapping(value={"/create"},method=RequestMethod.GET)
  		public ModelAndView create(){
  			ModelAndView model = model();
  			model.setViewName("facturacion/create");
  			return model;
  		}	
  
  		@RequestMapping(value={"/update/{id}"},method=RequestMethod.GET)
  		public ModelAndView create(@PathVariable("id") int id){
  			ModelAndView model = model();
  			model.addObject("factura", facturaService.find(id));
  			model.setViewName("facturacion/edit");
  		return model;
  		}
  
  		@RequestMapping(value={"/update"},method=RequestMethod.POST)
  		public String saveUpdate(@ModelAttribute("factura") Factura factura){
        		facturaService.update(factura);
        		return "redirect:/app/factura/view/"+factura.getId();
  		}
  		
  		@RequestMapping(value={"/delete/{id}"},method=RequestMethod.GET)
  		public ModelAndView delete(@PathVariable("id") int id){
        			facturaService.delete(facturaService.find(id));
        			return model();
  		}	
  		
  		public ModelAndView model(){
  			ModelAndView model = new ModelAndView("facturacion/list");
  			model.addObject("facturas", facturaService.findAll());
  			model.addObject("factura" , new Factura());
  			model.addObject("citas"	  , citaService.findByEstado());
        return model;
      }
}
