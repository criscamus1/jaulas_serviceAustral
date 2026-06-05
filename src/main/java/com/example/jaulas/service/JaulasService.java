package com.example.jaulas.service;

import com.example.jaulas.Extencion.Extencion;
import com.example.jaulas.dto.CreateDTO;
import com.example.jaulas.model.jaulas;
import com.example.jaulas.repository.JaulaRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class JaulasService {
 @Autowired
 private JaulaRepository repository;
    public List<jaulas> obtenerTodasLasJaulas() {
        return repository.findAll();
    }

    public jaulas buscarJaulaPorId(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new Extencion("La jaula solicitada no fue encontrada "));
    }

    public jaulas registrarJaula(CreateDTO dto) {
        jaulas jaula = new jaulas();
        jaula.setCentroId(dto.centroId());
        jaula.setCodigoJaula(dto.codigoJaula());
        jaula.setEstado("Funcionando"); 
        return repository.save(jaula);
    }
     public jaulas cambiarEstadoJaula(int id, String nuevoEstado) { //la use para caso de usuario 
        jaulas jaula = buscarJaulaPorId(id); /
        jaula.setEstado(nuevoEstado.toUpperCase());
        return repository.save(jaula);
    }

}
