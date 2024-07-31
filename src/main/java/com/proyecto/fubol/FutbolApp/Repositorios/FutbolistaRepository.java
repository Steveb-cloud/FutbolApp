package com.proyecto.fubol.FutbolApp.Repositorios;

import com.proyecto.fubol.FutbolApp.modelos.Futbolista;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class FutbolistaRepository {

    private final JdbcTemplate jdbcTemplate;

    public FutbolistaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Futbolista> getFutbolistasActivos() {
        String sql = "CALL SP_GET_FutbolistasACTIVE";
        return jdbcTemplate.query(sql, new FutbolistaRowMapper());
    }

    public Futbolista getFutbolista(int id) {
        String sql = "CALL SP_GET_Futbolistas(?)";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, new FutbolistaRowMapper());
        } catch (Exception e) {
            // Manejo de excepciones si el resultado no es encontrado
            return null;
        }
    }

    public void postFutbolista(Futbolista futbolista) {
        String sql = "CALL SP_INS_Futbolistas(?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                futbolista.getNombre(),
                futbolista.getApellido(),
                futbolista.getNumeroCamisa(),
                futbolista.getFechaNacimiento(),
                futbolista.getFechaRetiro());
    }

    public void putFutbolista(int id, Futbolista futbolista) {
        String sql = "CALL SP_UPD_Futbolistas(?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                id,
                futbolista.getNombre(),
                futbolista.getApellido(),
                futbolista.getNumeroCamisa(),
                futbolista.getFechaNacimiento(),
                futbolista.getFechaRetiro());
    }

    public void deleteFutbolista(int id) {
        String sql = "CALL SP_DEL_Futbolistas(?)";
        jdbcTemplate.update(sql, id);
    }

    private static class FutbolistaRowMapper implements RowMapper<Futbolista> {
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
}

