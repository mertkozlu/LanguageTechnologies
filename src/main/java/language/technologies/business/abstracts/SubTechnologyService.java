package language.technologies.business.abstracts;

import language.technologies.dto.requests.CreateSubTechnologiesRequest;
import language.technologies.dto.responses.GetAllSubTechnologyResponse;
import language.technologies.entities.ProgrammingLanguage;
import language.technologies.entities.SubTechnology;

import java.util.List;

public interface SubTechnologyService {
    List<GetAllSubTechnologyResponse> getALl();
    void add(CreateSubTechnologiesRequest createSubTechnologiesRequest);
    void deleteById(int id);

}
