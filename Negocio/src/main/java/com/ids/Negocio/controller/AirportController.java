package com.ids.Negocio.controller;

import com.ids.Negocio.services.airport.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping("/airport")
    public String paginaAirport(Model model){
        var airports=airportService.listarAeropuertos();
        model.addAttribute("airports",airports);
        return "airport"; //Ver la pagina HTML en Templates
    }
}
