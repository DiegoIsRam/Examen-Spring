package com.ids.Negocio.dao;

import com.ids.Negocio.domain.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportDao extends CrudRepository<Airport,Long> {
}
