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

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login){
        User user  = userRepository.searchByName(login.getUsername());
        if(user==null){
            throw new ApplicationException("User not found");
        }
        return "search";
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in exception handler of Login Controller");
        return "error";
    }

}