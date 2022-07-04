package com.ids.Negocio.services.employee;

import com.ids.Negocio.domain.Country;
import com.ids.Negocio.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> listarEmpleados();
    void guardaEmpleado(Employee employee);
    void eliminaEmpleado(Employee employee);
    Employee encontraEmpleado(Employee employee);
}
