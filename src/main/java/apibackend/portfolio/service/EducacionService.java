/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.service;

import apibackend.portfolio.exception.UserNotFoundException;
import apibackend.portfolio.model.Educacion;
import apibackend.portfolio.repository.EducacionRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepo educacionRepo;
    
    public Educacion crearEducacion(Educacion educacion){
    return educacionRepo.save(educacion);
    }
    
    public Educacion editarEducacion(Educacion educacion){
     return educacionRepo.save(educacion);
    }
    
    public void eliminarEducacion(int id){
        try{
        educacionRepo.deleteById(id);
        }catch(EmptyResultDataAccessException ex){
        throw new UserNotFoundException("No se encontro la Educacion, no existe");
        }
}
    
    public List<Educacion>obtenerEducacion(){
        return educacionRepo.findAll();
    }
    
}
