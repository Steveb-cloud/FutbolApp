package com.proyecto.fubol.FutbolApp.Servicios;
import com.proyecto.fubol.FutbolApp.modelos.HistoricoEquipo;
import com.proyecto.fubol.FutbolApp.Repositorios.HistoricoEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HistoricoService {

    @Autowired
    private HistoricoEquipoRepository historicoEquipoRepository;

    public List<HistoricoEquipo> getHistoricoEquipoById(int id) {

        return historicoEquipoRepository.findByIdH(id);
    }

 public List<HistoricoEquipo> llenarHistorico(ResultSet resultSet) throws SQLException {
    List<HistoricoEquipo> historicoEquipos = new ArrayList<>();
    while (resultSet.next()) {
        HistoricoEquipo historicoEquipo = new HistoricoEquipo();
        historicoEquipo.setNombre(resultSet.getString("Nombre"));
        historicoEquipo.setApellido(resultSet.getString("Apellido"));
        historicoEquipo.setNombreEquipo(resultSet.getString("NombreEquipo"));
        historicoEquipo.setFechaInicio(resultSet.getDate("Fecha_Inicio"));
        historicoEquipo.setFechaFin(resultSet.getDate("Fecha_Fin"));
        historicoEquipos.add(historicoEquipo);
    }
    return historicoEquipos;
    }
}

