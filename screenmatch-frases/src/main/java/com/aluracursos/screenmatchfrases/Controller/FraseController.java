package com.aluracursos.screenmatchfrases.Controller;

import com.aluracursos.screenmatchfrases.Service.FraseServicio;
import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    FraseServicio servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
