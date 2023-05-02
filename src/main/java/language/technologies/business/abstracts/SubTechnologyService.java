package language.technologies.business.abstracts;

import language.technologies.business.requests.CreateSubTechnologiesRequest;
import language.technologies.business.responses.GetAllSubTechnologyResponse;

import java.util.List;

public interface SubTechnologyService {
    List<GetAllSubTechnologyResponse> getALl();
    void add(CreateSubTechnologiesRequest createSubTechnologiesRequest);
}
