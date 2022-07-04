package com.ids.Negocio.services.language;

import com.ids.Negocio.domain.Country;
import com.ids.Negocio.domain.Language;

import java.util.List;

public interface LanguageService {
    List<Language> listarIdioma();
    void guardarIdioma(Language language);
    void eliminarIdioma(Language language);
    Language encontrarIdioma(Language language);
}
