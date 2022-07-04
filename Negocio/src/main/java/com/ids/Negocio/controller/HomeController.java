package com.ids.Negocio.controller;

import com.ids.Negocio.domain.Country;
import com.ids.Negocio.services.airport.AirportService;
import com.ids.Negocio.services.country.CountryService;
import com.ids.Negocio.services.employee.EmployeeService;
import com.ids.Negocio.services.language.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController {

    @GetMapping("/")
    public String paginaPrincipal(){
        return "home"; //Ver la pagina HTML en Templates
    }

}
