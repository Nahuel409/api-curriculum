/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.controller;

import apibackend.portfolio.model.Educacion;
import apibackend.portfolio.service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/educacion")
public class EducacionController {
    @Autowired
    EducacionService educacionService;
    
    @GetMapping
    public ResponseEntity<List<Educacion>>obtenerEducacion(){
    List<Educacion> educaciones = educacionService.obtenerEducacion();
    return new ResponseEntity<>(educaciones,HttpStatus.ACCEPTED);
    }
     
    @PostMapping
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
    Educacion edu = educacionService.crearEducacion(educacion);
    return new ResponseEntity<>(edu, HttpStatus.CREATED);
    }
    
    @PutMapping
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
    Educacion edu = educacionService.editarEducacion(educacion);
    return new ResponseEntity<>(edu, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarEducacion(@PathVariable int id){
        educacionService.eliminarEducacion(id);
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
}
