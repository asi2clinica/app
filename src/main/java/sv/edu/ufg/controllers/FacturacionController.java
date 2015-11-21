package sv.edu.ufg.controllers;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sv.edu.ufg.model.Factura;
import sv.edu.ufg.model.FormaFactura;
import sv.edu.ufg.model.FormaPago;
import sv.edu.ufg.service.CitaService;
import sv.edu.ufg.service.FacturaService;
import sv.edu.ufg.service.FormaFacturaService;
import sv.edu.ufg.service.FormaService;


@Controller
@Scope(value="session")
@RequestMapping(value={"/app/facturacion","/app/facturacion/"})
public class FacturacionController implements Serializable{
  
		private static final long serialVersionUID = 1L;

		Factura factura = new Factura();
	
  		@Autowired   FacturaService facturaService;
  		@Autowired   CitaService    citaService;
  		@Autowired   FormaService   formaService;
  		@Autowired   FormaFacturaService formaFacturaService;
  
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
  		
  		
  		@RequestMapping(value={"/create"},method=RequestMethod.POST)
  		public String createNew(@ModelAttribute("factura") Factura factura){
  			try{
  			factura.setEstado("E");
  			factura.setCredito("N");
  			factura.setCuotas(new BigDecimal(0));
  			factura.setFecha(new Date());
  			FormaFactura formaFactura = new FormaFactura(); formaFactura.setMonto(new BigDecimal(0));
  			formaFactura.setFactura(factura);
  			formaFactura.setFormaPago(formaService.find(factura.getFormaId()));
  			factura.setCita(citaService.find(factura.getCitaId()));
  			
  			
  			facturaService.create(factura);
  			//formaFacturaService.create(formaFactura);
  			factura.addFormaFactura(formaFactura);
  			//facturaService.create(factura);
  			}catch(NullPointerException e){
  				
  			}return "redirect:/app/facturacion/view/"+factura.getId() ;
  			
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
  		
  		@RequestMapping(value={"/view/{id}"},method=RequestMethod.GET)
  		public ModelAndView view(@PathVariable("id") int id){
  					ModelAndView model = model();
  					model.setViewName("facturacion/view");
  					model.addObject("factura", facturaService.find(id));
  					
  					return model;
  		}
  		
  		
  		public ModelAndView model(){
  			ModelAndView model = new ModelAndView("facturacion/list");
  			model.addObject("facturas", facturaService.findAll());
  			model.addObject("factura" , new Factura());
  			model.addObject("citas"	  , citaService.findAll());
  			model.addObject("formas"  , formaService.findAll());
  			return model;
  		}
  		
  		
  		
}
