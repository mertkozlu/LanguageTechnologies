package language.technologies.business.abstracts;

import language.technologies.dto.requests.CreateProgrammingLanguagesRequest;
import language.technologies.dto.responses.GetAllProgrammingLanguageResponse;
import language.technologies.dto.responses.GetByIdProgrammingLanguageResponse;
import language.technologies.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguageResponse> getALl();

    void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest);

    void deleteById(int id);

    GetByIdProgrammingLanguageResponse getById(int id) throws Exception;

    void update(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest, int id);

    ProgrammingLanguage getProgrammingLanguageById(int id);
}
