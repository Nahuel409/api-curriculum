/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
   private String nombre;
   private String apellido;
   private String titulo;
   private String descripcion;
   private String ubicacion;
   private String email;
   private String telefono;
   private String paginaweb;
 
    //Contructor

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String titulo, String descripcion, String ubicacion, String email, String telefono, String paginaweb) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.email = email;
        this.telefono = telefono;
        this.paginaweb = paginaweb;
    }
     
    
}
