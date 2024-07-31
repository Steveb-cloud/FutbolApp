package com.proyecto.fubol.FutbolApp.controladores;

import com.proyecto.fubol.FutbolApp.modelos.Futbolista;
import com.proyecto.fubol.FutbolApp.Servicios.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/futbolistas")
public class FutbolistaController {

    @Autowired
    private FutbolistaService futbolistaService;

    @GetMapping
    public List<Futbolista> getAllFutbolistas() {
        return futbolistaService.getAllFutbolistasActivos();
    }

    @GetMapping("/{id}")
    public Optional<Futbolista> getFutbolistaById(@PathVariable int id) {
        return futbolistaService.getFutbolistaById(id);
    }

    @PostMapping
    public Futbolista saveFutbolista(@RequestBody Futbolista futbolista) {
        return futbolistaService.saveFutbolista(futbolista);
    }

    @DeleteMapping("/{id}")
    public void deleteFutbolista(@PathVariable int id) {
        futbolistaService.deleteFutbolista(id);
    }
}
