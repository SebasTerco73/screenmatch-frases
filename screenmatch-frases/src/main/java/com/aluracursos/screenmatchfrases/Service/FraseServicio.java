package com.aluracursos.screenmatchfrases.Service;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseServicio {

    @Autowired
    private  FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
    Frase frase = repository.obtenerFraseAleatoria();
    return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
