package com.example.jaulas.controller;

import com.example.jaulas.dto.CreateDTO;
import com.example.jaulas.model.jaulas;
import com.example.jaulas.service.JaulasService;

import jakarta.validation.Valid;

import  org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;







@RestController
@RequestMapping("/api/jaulas")
public class JaulasController {
 @Autowired
 private JaulasService service;

  @GetMapping 
    public List<jaulas> listarTodo() {
        return service.obtenerTodasLasJaulas();
    }
    @GetMapping("/{id}") 
    public jaulas buscarPorId(@PathVariable int id) {
        return service.buscarJaulaPorId(id);
    }
    @PostMapping 
    public jaulas crear(@Valid @RequestBody CreateDTO dto) {
        return service.registrarJaula(dto);
    }
      @PutMapping("/{id}/bloquear")
    public jaulas bloquearCosecha(@PathVariable int id) {
        System.out.println("[WEBCLIENT RECEIVER]: Solicitud de bloqueo se realizara a la Jaula con ID: " + id);
        return service.cambiarEstadoJaula(id, "Tratamiento_bloqueado");
    }

 }
 
