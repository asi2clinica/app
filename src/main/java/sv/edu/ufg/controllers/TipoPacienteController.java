/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ufg.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import sv.edu.ufg.model.TipoPaciente;
import sv.edu.ufg.service.TipoPacienteService;

/**
 *
 * @author Heraldo
 */
@Controller
@RequestMapping(value={"/app/tipopaciente"})
public class TipoPacienteController {
    
    
    @Autowired TipoPacienteService tipoPacienteService;
    
    @RequestMapping(value = "/json",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public @ResponseBody  List<TipoPaciente> jsonTipoPaciente(){
    	
        return tipoPacienteService.findAll();
    }

    
    
}
