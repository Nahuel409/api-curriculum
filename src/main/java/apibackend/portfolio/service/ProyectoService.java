/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.service;

import apibackend.portfolio.exception.UserNotFoundException;
import apibackend.portfolio.model.Proyecto;
import apibackend.portfolio.repository.ProyectoRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author dnvx8
 */
@Service
@Transactional
public class ProyectoService {

    @Autowired
    ProyectoRepo proyectoRepo;

    public List<Proyecto> obtenerProyectos() {
        return proyectoRepo.findAll();
    }

    public Proyecto crearProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public Proyecto editarProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public void eliminarProyecto(int id) {
        try {
            proyectoRepo.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            throw new UserNotFoundException("Proyecto no encontrado, no existe");
        }
    }
}
