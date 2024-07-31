package com.proyecto.fubol.FutbolApp.Repositorios;

import com.proyecto.fubol.FutbolApp.modelos.HistoricoEquipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoEquipoRepository extends JpaRepository<HistoricoEquipo, Integer> {
    List<HistoricoEquipo> findByIdH(int id);}

