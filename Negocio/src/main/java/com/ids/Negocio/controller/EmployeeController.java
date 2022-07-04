package com.ids.Negocio.controller;

import com.ids.Negocio.services.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public String paginaEmployee(Model model){
        var employees=employeeService.listarEmpleados();
        model.addAttribute("employees",employees);
        return "employee"; //Ver la pagina HTML en Templates
    }
}
