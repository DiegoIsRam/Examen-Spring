package com.ids.Negocio.controller;

import com.ids.Negocio.services.language.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanguageController {
    @Autowired
    private LanguageService languageService;

    @GetMapping("/language")
    public String paginaLanguage(Model model){
        var languages=languageService.listarIdioma();
        model.addAttribute("languages",languages);
        return "language"; //Ver la pagina HTML en Templates
    }
}
