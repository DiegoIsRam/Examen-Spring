package com.ids.Negocio.services.country;

import com.ids.Negocio.domain.Airport;
import com.ids.Negocio.domain.Country;

import java.util.List;

public interface CountryService {
    List<Country> listarPaises();
    void guardaPais(Country country);
    void eliminaPais(Country country);
    Country encontraPais(Country country);
}
