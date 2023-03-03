
package apibackend.portfolio.repository;

import apibackend.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Integer>{
    
}
