package com.ids.Negocio.services.employee;

import com.ids.Negocio.dao.EmployeeDao;
import com.ids.Negocio.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDao employeeDao;
    @Override
    public List<Employee> listarEmpleados() {
        return (List<Employee>) employeeDao.findAll();
    }

    @Override
    public void guardaEmpleado(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public void eliminaEmpleado(Employee employee) {
        employeeDao.delete(employee);
    }

    @Override
    public Employee encontraEmpleado(Employee employee) {
        return employeeDao.findById(employee.getId()).orElse(null);
    }
}
