/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.controller;

import apibackend.portfolio.model.Proyecto;
import apibackend.portfolio.service.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author dnvx8
 */
@RestController
@RequestMapping("api/proyecto")
public class ProyectoController {
    @Autowired
    ProyectoService proyectoService;
    
    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Proyecto>> obtenerProyectos(){
        List<Proyecto>lista = proyectoService.obtenerProyectos();
        return new ResponseEntity(lista, HttpStatus.OK);
        }
    
    @PostMapping
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
    Proyecto proyect = proyectoService.crearProyecto(proyecto);
    return new ResponseEntity<>(proyect, HttpStatus.CREATED);
    }
    
    @PutMapping
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto){
    Proyecto proyect = proyectoService.editarProyecto(proyecto);
    return new ResponseEntity<>(proyect, HttpStatus.ACCEPTED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProyecto(@PathVariable int id){
         proyectoService.eliminarProyecto(id);
       return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
