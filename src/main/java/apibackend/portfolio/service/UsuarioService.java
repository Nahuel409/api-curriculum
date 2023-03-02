
package apibackend.portfolio.service;

import apibackend.portfolio.exception.UserNotFoundException;
import apibackend.portfolio.model.Usuario;
import apibackend.portfolio.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService{
    @Autowired
    UsuarioRepo usuarioRepo;
    
    public Usuario obtenerUsuario(int id){
        return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("usuario no encontrado"));
    }
}
