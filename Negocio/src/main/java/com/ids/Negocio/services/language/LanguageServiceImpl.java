package com.ids.Negocio.services.language;

import com.ids.Negocio.dao.LanguageDao;
import com.ids.Negocio.domain.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageServiceImpl implements LanguageService{
    @Autowired
    LanguageDao languageDao;
    @Override
    public List<Language> listarIdioma() {
        return (List<Language>) languageDao.findAll();
    }

    @Override
    public void guardarIdioma(Language language) {
        languageDao.save(language);
    }

    @Override
    public void eliminarIdioma(Language language) {
        languageDao.delete(language);
    }

    @Override
    public Language encontrarIdioma(Language language) {
        return languageDao.findById(language.getId()).orElse(null);
    }
}
