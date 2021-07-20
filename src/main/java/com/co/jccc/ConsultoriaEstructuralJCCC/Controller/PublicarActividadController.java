package com.co.jccc.ConsultoriaEstructuralJCCC.Controller;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.PublicarActividad;
import com.co.jccc.ConsultoriaEstructuralJCCC.Exceptions.ApplicationException;
import com.co.jccc.ConsultoriaEstructuralJCCC.Repository.PublicarActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import javax.validation.Valid;

@Controller
public class PublicarActividadController {

    @Autowired
    private PublicarActividadRepository publicarActividadRepository;

    @PostMapping
    public PublicarActividadRepository AddPublicacion(@Valid PublicarActividadRepository publicarActividad) {
        return publicarActividadRepository.SavePublicacion(publicarActividad); 
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in exception handler of Login Controller");
        return "error";
    }

}