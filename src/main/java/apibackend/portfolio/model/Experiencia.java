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

/**
 *
 * @author dnvx8
 */
@Getter
@Setter
@Entity
public class Experiencia implements Serializable{
      @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idExp;
    private String tituloExp;
    private String descExp;
    private String fechaExp;
    
    
    //Constructor

    public Experiencia(){
    }

    public Experiencia(String tituloExp, String descExp, String fechaExp) {
        this.tituloExp = tituloExp;
        this.descExp = descExp;
        this.fechaExp = fechaExp;
    }

   
    
}
