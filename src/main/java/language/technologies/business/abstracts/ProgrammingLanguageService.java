package language.technologies.business.abstracts;

import language.technologies.dto.requests.CreateProgrammingLanguagesRequest;
import language.technologies.dto.requests.CreateSubTechnologiesRequest;
import language.technologies.dto.responses.GetAllProgrammingLanguageResponse;
import language.technologies.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguageResponse> getALl();
    void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest);
    void delete(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest);

}
