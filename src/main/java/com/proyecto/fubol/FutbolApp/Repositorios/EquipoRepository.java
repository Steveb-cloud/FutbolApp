package com.proyecto.fubol.FutbolApp.Repositorios;

import com.proyecto.fubol.FutbolApp.modelos.equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<equipo, Integer> {
}
