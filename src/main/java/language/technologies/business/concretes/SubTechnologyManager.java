package language.technologies.business.concretes;

import language.technologies.business.abstracts.ProgrammingLanguageService;
import language.technologies.business.abstracts.SubTechnologyService;
import language.technologies.dataAccess.abstracts.ProgrammingLanguageRepository;
import language.technologies.dto.requests.CreateSubTechnologiesRequest;
import language.technologies.dto.requests.DeleteSubTechnologiesRequest;
import language.technologies.dto.responses.GetAllSubTechnologyResponse;
import language.technologies.dataAccess.abstracts.SubTechnologyRepository;
import language.technologies.dto.responses.GetByIdSubTechnologyResponse;
import language.technologies.entities.ProgrammingLanguage;
import language.technologies.entities.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {
    private final SubTechnologyRepository subTechnologyRepository;
    private final ProgrammingLanguageRepository programmingLanguageRepository;

    private final ProgrammingLanguageService programmingLanguageService;

    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository, ProgrammingLanguageRepository programmingLanguageRepository,
                                ProgrammingLanguageService programmingLanguageService) {
        this.subTechnologyRepository = subTechnologyRepository;
        this.programmingLanguageRepository = programmingLanguageRepository;
        this.programmingLanguageService = programmingLanguageService;
    }

    @Override
    public List<GetAllSubTechnologyResponse> getALl() {
        List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
        List<GetAllSubTechnologyResponse> subTechnologiesResponses = new ArrayList<GetAllSubTechnologyResponse>();

        for (SubTechnology subTechnology : subTechnologies) {
            GetAllSubTechnologyResponse responseItem = new GetAllSubTechnologyResponse();
            responseItem.setName(subTechnology.getName());
            responseItem.setId(subTechnology.getId());

            subTechnologiesResponses.add(responseItem);
        }
        return subTechnologiesResponses;
    }

    @Override
    public void add(CreateSubTechnologiesRequest createSubTechnologiesRequest) {

        ProgrammingLanguage programmingLanguage = programmingLanguageService.getProgrammingLanguageById(createSubTechnologiesRequest.getId());
        SubTechnology subTechnology = new SubTechnology();
        subTechnology.setName(createSubTechnologiesRequest.getName());
        subTechnology.setProgrammingLanguage(programmingLanguage);
        this.subTechnologyRepository.save(subTechnology);

    }

    @Override
    public void deleteById(DeleteSubTechnologiesRequest deleteSubTechnologiesRequest) {
        this.subTechnologyRepository.deleteById(deleteSubTechnologiesRequest.getDeleteId());
    }

    @Override
    public SubTechnology getSubTechnologyById(int id) {
        return subTechnologyRepository.findById(id).orElse(null);
    }

    @Override
    public void update(CreateSubTechnologiesRequest createSubTechnologiesRequest, int id) {
        SubTechnology subTechnology = subTechnologyRepository.findById(id).get();
        subTechnology.setName(createSubTechnologiesRequest.getName());
        subTechnologyRepository.save(subTechnology);
    }

    @Override
    public GetByIdSubTechnologyResponse getById(int id) throws Exception {
        SubTechnology subTechnology = subTechnologyRepository.findById(id).orElse(null);
        if (subTechnology == null) {
            throw new Exception("SubTechnology could not find");

        }
        return new GetByIdSubTechnologyResponse(subTechnology);
    }

}
