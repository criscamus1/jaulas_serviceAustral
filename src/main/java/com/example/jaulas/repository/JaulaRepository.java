package com.example.jaulas.repository;

import com.example.jaulas.model.jaulas;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JaulaRepository {

private List<jaulas> listaJaulas= new ArrayList<>();

public List<jaulas>obtenerJaulas(){
    return obtenerJaulas();
}

public jaulas buscarJaulaId(int id){
    for(jaulas jau:listaJaulas){
        if(jau.getId()==id){
            return jau;
        }
    }
    return null;
}

public jaulas actualizar(jaulas jau){
 int id =0;
 int idPosicion=0;
 for(int i =0; i <listaJaulas.size();i++){
    if(listaJaulas.get(i).getId()==jau.getId()){
        id=jau.getId();
        idPosicion=1;
    }
 }  
  jaulas jau1=new jaulas();
  jau1.setId(id);
  jau1.setCentroId(jau.getCentroId());
  jau1.setCodigo(jau.getCodigo());
  jau1.setCapacidadPeces(jau.getCapacidadPeces());
  jau1.setEstado(jau.getEstado());
  listaJaulas.set(idPosicion, jau1);
  return jau1;
}
public jaulas guardar(jaulas jau){
    listaJaulas.add(jau);
    return jau;
}
public void  eliminar(int id){
    jaulas jau=buscarJaulaId(id);
    if(jau!=null){
        listaJaulas.remove(jau);
    }
}

}
