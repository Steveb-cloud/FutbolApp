package com.proyecto.fubol.FutbolApp.Repositorios;

import com.proyecto.fubol.FutbolApp.modelos.Futbolista;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FutbolistaRowMapper implements RowMapper<Futbolista> {
    @Override
    public Futbolista mapRow(ResultSet rs, int rowNum) throws SQLException {
        Futbolista futbolista = new Futbolista();
        futbolista.setId(rs.getInt("ID"));
        futbolista.setNombre(rs.getString("Nombre"));
        futbolista.setApellido(rs.getString("Apellido"));
        futbolista.setNumeroCamisa(rs.getInt("Numero_Camisa"));
        futbolista.setFechaNacimiento(rs.getDate("Fecha_Nacimiento"));
        futbolista.setFechaRetiro(rs.getDate("Fecha_Retiro"));
        futbolista.setEstado(rs.getString("Estado"));
        return futbolista;
    }
}
