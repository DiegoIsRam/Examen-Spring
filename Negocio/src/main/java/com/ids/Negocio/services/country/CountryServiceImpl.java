package com.ids.Negocio.services.country;

import com.ids.Negocio.dao.CountryDao;
import com.ids.Negocio.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    CountryDao countryDao;

    @Override
    @Transactional (readOnly = true)
    public List<Country> listarPaises() {
        return (List<Country>) countryDao.findAll();
    }

    @Override
    public void guardaPais(Country country) {
        countryDao.save(country);
    }

    @Override
    public void eliminaPais(Country country) {
        countryDao.delete(country);

    }

    @Override
    public Country encontraPais(Country country) {
        return countryDao.findById(country.getId()).orElse(null);
    }
}
