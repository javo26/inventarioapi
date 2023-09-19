package edu.galileo.inventario.service;


import edu.galileo.inventario.model.Equipo;
import edu.galileo.inventario.model.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;
    public Equipo add(Equipo equipo){
        return this.equipoRepository.save(equipo);
    }
    public List<Equipo> list(){
        return this.equipoRepository.findAll();
    }
}