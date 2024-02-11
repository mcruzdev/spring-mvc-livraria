package dev.matheuscruz.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {


//    @GetMapping("/home")
//    public ModelAndView home(Model model, @RequestParam(name = "logged", required = false) boolean logged) {
//        if (!logged) {
//            return new ModelAndView("redirect:/").addObject("logged", false);
//        }
//        return new ModelAndView("home").addObject("logged", true);
//    }

    @GetMapping(value = "/login")
    public String login() {

        return "login";
    }

}
