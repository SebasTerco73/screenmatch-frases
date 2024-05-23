package com.aluracursos.screenmatchfrases.Service;

import com.aluracursos.screenmatchfrases.dto.FraseDTO;
import com.aluracursos.screenmatchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

 @Query("SELECT f FROM Frase f ORDER BY function('RANDOM') LIMIT 1")
   public Frase obtenerFraseAleatoria();
}
