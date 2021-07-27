package com.co.jccc.ConsultoriaEstructuralJCCC.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //Controlador o mapeo para ir a la pagina home

    //Ruta o mapeo
    @GetMapping("/home")
    public String goHome(){
        System.out.println("En home/pagina Controller");
        return "index";
    }

    //mapeo ir a Actividad
    @GetMapping("/goToActividad")
    public String goToActividad(){
        System.out.println("Ir al Modulo Actividad");
        return "Actividad";
    }

    //mapeo ir a Login
    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("going to login page");
        return "login";
    }

    //mapeo ir a Registrar
    @GetMapping("/goToRegistration")
    public String goToRegistration() {
        System.out.println("Ir a la pagina de Registrar");
        return "register";
    }

    //Model attribute para un nuevo Usuario
    /*@ModelAttribute ("newuser")
    public User getDefaultUser()
    {
        return new User();

    }*/

    /*//Model attribute para generar listo de arreglo para generos
    @ModelAttribute ("genderItems")
    public List<String> getGenderItems() {

        return Arrays.asList(new String[]{"Male", "Famale", "Other"});
    }


    @ModelAttribute("login")
    public Login getDefaultLogin() {
        return new Login();
    }*/


}

