package com.proyecto.fubol.FutbolApp.Servicios;

import com.proyecto.fubol.FutbolApp.modelos.Futbolista;
import com.proyecto.fubol.FutbolApp.Repositorios.FutbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolistaService {

    @Autowired
    private FutbolistaRepository futbolistaRepository;

    public List<Futbolista> getFutbolistasActivos() {
        return futbolistaRepository.getFutbolistasActivos();
    }

    public Futbolista getFutbolista(int id) {
        return futbolistaRepository.getFutbolista(id);
    }

    public void postFutbolista(Futbolista futbolista) {
        futbolistaRepository.postFutbolista(futbolista);
    }

    public void putFutbolista(int id, Futbolista futbolista) {
        futbolistaRepository.putFutbolista(id, futbolista);
    }

    public void deleteFutbolista(int id) {
        futbolistaRepository.deleteFutbolista(id);
    }
}
