package com.Final.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Mapeo para la página principal
    @GetMapping("/")
    public String showIndex() {
        return "index";  // Devuelve el archivo index.html ubicado en src/main/resources/templates
    }

    // Mapeo para la página principal
    @GetMapping("/principal")
    public String showPrincipal() {
        return "principal";  // Devuelve el archivo principal.html ubicado en src/main/resources/templates
    }
}
