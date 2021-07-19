package com.co.jccc.ConsultoriaEstructuralJCCC.Controller;

import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.Login;
import com.co.jccc.ConsultoriaEstructuralJCCC.Beans.User;
import com.co.jccc.ConsultoriaEstructuralJCCC.Exceptions.ApplicationException;
import com.co.jccc.ConsultoriaEstructuralJCCC.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
@Controller
public class CrearActividadController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public CrearActividadController AddActividad(@Valid CrearActividadController crearActividadController) {
        return userRepository.SaveActividad(crearActividadController); 
    }
    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in exception handler of Login Controller");
        return "error";
    }

}