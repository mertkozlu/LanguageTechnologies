package language.technologies.business.abstracts;

import language.technologies.business.requests.CreateProgrammingLanguagesRequest;
import language.technologies.business.responses.GetAllProgrammingLanguageResponse;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguageResponse> getALl();
    void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest);
}
