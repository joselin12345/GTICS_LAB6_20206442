package com.example.lab6_gtics_20206442.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("")
    public String inicio(){
        return "index";
    }

}
