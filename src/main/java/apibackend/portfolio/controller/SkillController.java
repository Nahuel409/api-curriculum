/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.controller;

import apibackend.portfolio.model.Skill;
import apibackend.portfolio.service.SkillService;
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
@RequestMapping("/api/skill")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {

    @Autowired
    SkillService skillService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Skill>> obtenerSkills() {
        List<Skill> listaSkill = skillService.Obtenerskills();
        return new ResponseEntity<>(listaSkill, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skill> crearSkill(@RequestBody Skill skill) {
        Skill cSkill = skillService.crearSkill(skill);
        return new ResponseEntity<>(cSkill, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Skill> editarSkill(@RequestBody Skill skill) {
        Skill skillEditada = skillService.editarSkill(skill);
        return new ResponseEntity<>(skillEditada, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarSkill(@PathVariable int id) {
        skillService.eliminarSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
