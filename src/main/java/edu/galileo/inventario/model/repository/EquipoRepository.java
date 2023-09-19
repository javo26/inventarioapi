package edu.galileo.inventario.model.repository;

import edu.galileo.inventario.model.Equipo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EquipoRepository extends CrudRepository<Equipo, Integer> {
    List<Equipo> findAll();
}
