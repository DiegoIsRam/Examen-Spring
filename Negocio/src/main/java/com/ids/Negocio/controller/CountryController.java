package com.ids.Negocio.controller;

import com.ids.Negocio.domain.Country;
import com.ids.Negocio.services.country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;
    @GetMapping("/country")
    public String mostrarListaPaises(Model model){
        var countries=countryService.listarPaises();
        model.addAttribute("countries",countries);
        return "country"; //Ver la pagina HTML en Templates
    }
    @GetMapping("/country/agregar")
    public String agregarCountry(Country country){
        return "modificarCountry";
    }
    @PostMapping("/country/guardar")
    public String guardarCountry(Country country){
        countryService.guardaPais(country);
        return "redirect:/country";
    }
    @GetMapping("/country/editar/{id}")
    public String editarCountry(Country country, Model model){
        country=countryService.encontraPais(country);
        model.addAttribute("country",country);
        return "modificarCountry";
    }


}
