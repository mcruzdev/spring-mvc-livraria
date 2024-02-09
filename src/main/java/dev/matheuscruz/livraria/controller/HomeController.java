package dev.matheuscruz.livraria.controller;

import dev.matheuscruz.livraria.controller.data.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping("/home")
    public ModelAndView home(Model model, @RequestParam(name = "logged", required = false) boolean logged) {
        if (!logged) {
            return new ModelAndView("redirect:/").addObject("logged", false);
        }
        return new ModelAndView("home").addObject("logged", true);
    }

    @PostMapping(value = "/login")
    public ModelAndView login(@ModelAttribute Login login) {
        System.out.println(login);
        return new ModelAndView("redirect:/home")
                .addObject("logged", true);
    }

    @GetMapping
    public ModelAndView login() {
        return new ModelAndView("home").addObject("logged", false);
    }

}
