package language.technologies.business.concretes;

import language.technologies.business.abstracts.SubTechnologyService;
import language.technologies.dataAccess.abstracts.ProgrammingLanguageRepository;
import language.technologies.dto.requests.CreateSubTechnologiesRequest;
import language.technologies.dto.responses.GetAllSubTechnologyResponse;
import language.technologies.dataAccess.abstracts.SubTechnologyRepository;
import language.technologies.entities.ProgrammingLanguage;
import language.technologies.entities.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {
    private SubTechnologyRepository subTechnologyRepository;
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository, ProgrammingLanguageRepository programmingLanguageRepository) {
        this.subTechnologyRepository = subTechnologyRepository;
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllSubTechnologyResponse> getALl() {
        List<SubTechnology> subTechnologies  = subTechnologyRepository.findAll();
        List<GetAllSubTechnologyResponse> subTechnologiesResponses = new ArrayList<GetAllSubTechnologyResponse>();

        for (SubTechnology subTechnology : subTechnologies) {
            GetAllSubTechnologyResponse responseItem = new GetAllSubTechnologyResponse();
            responseItem.setName(subTechnology.getName());

            subTechnologiesResponses.add(responseItem);
        }
        return subTechnologiesResponses;
    }

    @Override
    public void add(CreateSubTechnologiesRequest createSubTechnologiesRequest) {
        SubTechnology subTechnology = new SubTechnology();
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(createSubTechnologiesRequest.getLanguageId()).get();

        subTechnology.setName(createSubTechnologiesRequest.getName());
        subTechnology.setProgrammingLanguage(programmingLanguage);
        this.subTechnologyRepository.save(subTechnology);

    }

    @Override
    public void deleteById(int id) {
        this.subTechnologyRepository.deleteById(id);
    }

}
