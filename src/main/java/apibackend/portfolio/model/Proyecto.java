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
import lombok.*;

/**
 *
 * @author dnvx8
 */
@Getter
@Setter
@Entity
public class Proyecto implements Serializable{
     @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idProyecto;
    private String tituloProyecto;
    private String descProyecto;
    private String imgProyecto;

    public Proyecto() {
    }

    public Proyecto(String tituloProyecto, String descProyecto, String imgProyecto) {
        this.tituloProyecto = tituloProyecto;
        this.descProyecto = descProyecto;
        this.imgProyecto = imgProyecto;
    }
}
