/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.service;

import apibackend.portfolio.exception.UserNotFoundException;
import apibackend.portfolio.model.Experiencia;
import apibackend.portfolio.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class ExperienciaService {

    @Autowired
    ExperienciaRepo experienciaRepo;

    public List<Experiencia> obtenerExperiencias() {
        return experienciaRepo.findAll();
    }

    public Experiencia crearExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public Experiencia editarExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public void eliminarExperiencia(int id) {
        try {
            experienciaRepo.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            throw new UserNotFoundException("Experiencia no encontrada, no existe");
        }
    }
}
