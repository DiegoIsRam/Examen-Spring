package com.ids.Negocio.controller;

import com.ids.Negocio.domain.Language;
import com.ids.Negocio.services.language.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/language/agregar")
    public String agregarLanguage(Language language){
        return "modificarLanguage";
    }
    @PostMapping("/language/guardar")
    public String guardarLanguage(Language language){
        languageService.guardarIdioma(language);
        return "redirect:/language";
    }
    @GetMapping("/language/editar/{id}")
    public String editarLanguage(Language language, Model model){
        language=languageService.encontrarIdioma(language);
        model.addAttribute("language",language);
        return "modificarLanguage";
    }
}
