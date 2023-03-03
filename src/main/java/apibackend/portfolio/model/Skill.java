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
public class Skill implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idSkill;
    private String tituloSkill;
    private String imgSkill;
    private int porcentaje;

    public Skill() {
    }

    public Skill(String tituloSkill, String imgSkill, int porcentaje) {
        this.tituloSkill = tituloSkill;
        this.imgSkill = imgSkill;
        this.porcentaje = porcentaje;
    }
}
