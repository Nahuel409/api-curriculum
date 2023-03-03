
package apibackend.portfolio.controller;

import apibackend.portfolio.model.Experiencia;
import apibackend.portfolio.service.ExperienciaService;
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
@RequestMapping("/api/experiencia")
public class ExperienciaController {
    @Autowired
    ExperienciaService experienciaService;
    
    @GetMapping
    public ResponseEntity<List<Experiencia>>obtenerExperiencias(){
        List <Experiencia> experiencias = experienciaService.obtenerExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
        }
    
    @PostMapping
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
    Experiencia exp = experienciaService.crearExperiencia(experiencia);
    return new ResponseEntity<>(exp, HttpStatus.CREATED);
    }
    
    
    @PutMapping
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
    Experiencia exp = experienciaService.editarExperiencia(experiencia);
    return new ResponseEntity<>(exp, HttpStatus.ACCEPTED);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarExperiencia(@PathVariable int id){
        experienciaService.eliminarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    }

