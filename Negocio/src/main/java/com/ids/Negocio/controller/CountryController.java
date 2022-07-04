package com.ids.Negocio.controller;

import com.ids.Negocio.services.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;
    @GetMapping("/country")
    public String paginaCountry(Model model){
        var countries=countryService.listarPaises();
        model.addAttribute("countries",countries);
        return "country"; //Ver la pagina HTML en Templates
    }
}
