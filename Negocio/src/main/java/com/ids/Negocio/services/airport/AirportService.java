package com.ids.Negocio.services.airport;

import com.ids.Negocio.domain.Airport;

import java.util.List;

public interface AirportService {
    List<Airport> listarAeropuertos();
    void guardarAeropuerto(Airport airport);
    void eliminarAeropuerto(Airport airport);
    Airport encontrarAeropuerto(Airport airport);
}
