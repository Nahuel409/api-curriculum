/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.service;

import apibackend.portfolio.exception.UserNotFoundException;
import apibackend.portfolio.model.Skill;
import apibackend.portfolio.repository.SkillRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author dnvx8
 */
@Service
@Transactional
public class SkillService {

    @Autowired
    SkillRepo skillRepo;

    public List<Skill> Obtenerskills() {
        return skillRepo.findAll();
    }

    public Skill crearSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public Skill editarSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public void eliminarSkill(int id) {
        try {
            skillRepo.deleteById(id);
        } catch (EmptyResultDataAccessException ex) {
            throw new UserNotFoundException("no se encontro la Skill, no existe");
        }
    }
}
