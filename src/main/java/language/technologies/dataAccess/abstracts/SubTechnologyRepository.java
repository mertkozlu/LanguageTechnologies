package language.technologies.dataAccess.abstracts;

import language.technologies.entities.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer> {
}
