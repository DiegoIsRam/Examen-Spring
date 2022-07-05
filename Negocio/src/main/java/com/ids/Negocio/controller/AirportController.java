package com.ids.Negocio.controller;

import com.ids.Negocio.domain.Airport;

import com.ids.Negocio.services.airport.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/airport/agregar")
    public String agregarAirport(Airport airport){
        return "modificarAirport";
    }
    @PostMapping("/airport/guardar")
    public String guardarAirport(Airport airport){
        airportService.guardarAeropuerto(airport);
        return "redirect:/airport";
    }
    @GetMapping("/airport/editar/{id}")
    public String editarAirport(Airport airport, Model model){
        airport=airportService.encontrarAeropuerto(airport);
        model.addAttribute("airport",airport);
        return "modificarAirport";
    }

}
