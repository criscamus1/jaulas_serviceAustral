package com.example.jaulas.service;

import com.example.jaulas.model.jaulas;
import com.example.jaulas.repository.JaulaRepository;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class JaulasService {
 @Autowired
 private JaulaRepository repository;
 
 public List<jaulas>obtenerJaulas(){
  return repository.obtenerJaulas();
 }
public jaulas buscarJaulas(int id){
 return repository.buscarJaulaId(id);
 }
public jaulas actualizarJaulas(jaulas jau){
    return repository.actualizar(jau);
}

public jaulas guardarJaula(jaulas jau){
 return repository.guardar(jau);
 }
public String eliminar(int id){
    repository.eliminar(id);
    return "la jaula fue eliminada";
}

}
