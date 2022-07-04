package com.ids.Negocio.dao;

import com.ids.Negocio.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Long> {
}
