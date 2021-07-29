/*package com.co.jccc.ConsultoriaEstructuralJCCC.Controller;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.CrearActividad;
import com.co.jccc.ConsultoriaEstructuralJCCC.Exceptions.ApplicationException;
import com.co.jccc.ConsultoriaEstructuralJCCC.Repository.CrearActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;

@Controller
public class CrearActividadController {

    @Autowired
    private CrearActividadRepository crearActividadRepository;

    @PostMapping
    public CrearActividadRepository AddActividad(@Valid  CrearActividadRepository crearActividad) {
        return crearActividadRepository.SaveActividad(crearActividad); 
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in exception handler of Login Controller");
        return "error";
    }

}*/