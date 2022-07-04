package com.ids.Negocio.services.airport;

import com.ids.Negocio.dao.AirportDao;
import com.ids.Negocio.domain.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    private AirportDao airportDao;

    @Override
    @Transactional (readOnly = true)
    public List<Airport> listarAeropuertos() {
        return (List<Airport>) airportDao.findAll();
    }

    @Override
    @Transactional
    public void guardarAeropuerto(Airport airport) {
        airportDao.save(airport);

    }

    @Override
    @Transactional
    public void eliminarAeropuerto(Airport airport) {
        airportDao.delete(airport);
    }

    @Override
    @Transactional
    public Airport encontrarAeropuerto(Airport airport) {
        return airportDao.findById(airport.getId()).orElse(null);
    }
}
