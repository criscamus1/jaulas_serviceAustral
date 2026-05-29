package com.example.jaulas.controller;

import com.example.jaulas.model.jaulas;
import com.example.jaulas.service.JaulasService;

import  org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;







@RestController
@RequestMapping("/jaulas")
public class JaulasController {
 @Autowired
 private JaulasService service;

 @GetMapping
 public List<jaulas>listarJaulas(){
    return service.obtenerJaulas();
 }
 @GetMapping("/{id}")
 public jaulas buscarJaulas(@PathVariable int id){
  return service.buscarJaulas(id);
 }
 @PostMapping
 public jaulas guardarJaulas(@RequestBody jaulas jau){
  return service.guardarJaula(jau);
 }
 @PutMapping
 public jaulas actualizarJaulas(@RequestBody jaulas jau){
    return service.actualizarJaulas(jau);
 }
 @DeleteMapping("/{id}")
 public void eliminar(@PathVariable int id){
     service.eliminar(id);
 }

 }
 
