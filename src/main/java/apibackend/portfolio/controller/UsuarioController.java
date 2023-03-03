
package apibackend.portfolio.controller;

import apibackend.portfolio.model.Usuario;
import apibackend.portfolio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
     
    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        Usuario nuevo = usuarioService.crearUsuario(usuario);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }
    
    
     @PutMapping
     public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
     Usuario usuarioEditar = usuarioService.editarUsuario(usuario);
     return new ResponseEntity<>(usuarioEditar, HttpStatus.ACCEPTED);
     }
     
}
