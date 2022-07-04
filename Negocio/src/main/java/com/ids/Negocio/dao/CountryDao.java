package com.ids.Negocio.dao;

import com.ids.Negocio.domain.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryDao extends CrudRepository<Country,Long> {
}
