package language.technologies.business.concretes;

import language.technologies.business.abstracts.ProgrammingLanguageService;
import language.technologies.dto.requests.CreateProgrammingLanguagesRequest;
import language.technologies.dto.responses.GetAllProgrammingLanguageResponse;
import language.technologies.dataAccess.abstracts.ProgrammingLanguageRepository;
import language.technologies.entities.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private final ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllProgrammingLanguageResponse> getALl() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguageResponse> programmingLanguageResponses = new ArrayList<GetAllProgrammingLanguageResponse>();

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            GetAllProgrammingLanguageResponse responseItem = new GetAllProgrammingLanguageResponse();
            responseItem.setId(programmingLanguage.getId());
            responseItem.setName(programmingLanguage.getName());

            programmingLanguageResponses.add(responseItem);
        }

        return programmingLanguageResponses;
    }

    @Override
    public void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(createProgrammingLanguagesRequest.getName());
        this.programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void deleteById(int id) {
        this.programmingLanguageRepository.deleteById(id);
    }


    @Override
    public ProgrammingLanguage getProgramingLanguageById(int id) {
        return programmingLanguageRepository.findById(id).orElse(null);
    }

    @Override
    public void update(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest, int id) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
        programmingLanguage.setName(createProgrammingLanguagesRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }

}
