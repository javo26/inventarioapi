package edu.galileo.inventario.controller;


import edu.galileo.inventario.model.Equipo;
import edu.galileo.inventario.service.EquipoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/equipo")
public class EquipoController {
    private EquipoService equipoService;
    EquipoController(EquipoService equipoService){
        this.equipoService = equipoService;
    }
    @GetMapping
    public List<Equipo> getAll(){
        return this.equipoService.list();
    }
    @PostMapping
    public Equipo add(@RequestBody(required=true) Equipo equipo){
        return this.equipoService.add(equipo);
    }
}
