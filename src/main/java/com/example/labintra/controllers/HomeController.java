package com.example.labintra.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String Accueil() {
        return "accueil";
    }
}

//return new ModelAndView("error", "model", new Errors(request.getRequestURL().toString(), e));