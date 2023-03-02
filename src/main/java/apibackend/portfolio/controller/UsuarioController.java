/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.controller;

import apibackend.portfolio.model.Usuario;
import apibackend.portfolio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
     public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Integer id){
    Usuario usuario = usuarioService.obtenerUsuario(id);
    return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
}
