package com.example.urlmapping.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//git config --global user.email ""
//git config --global user.username ""

@Controller
public class WelcomeController {
    @GetMapping("/greet")
    public String greeting(Model model){
        model.addAttribute("tagline","Hello");
        return "welcome";
    }
    @GetMapping("/")
    public  String  saySpring(Model model){
        model.addAttribute("tagline","say spring mvc");
        return "welcome";
    }
    @GetMapping({"/","/home"})
    public String welcome(Model model) {
        model.addAttribute("tagline", "Welcome Spring MVC");
        return "welcome";
    }
}
