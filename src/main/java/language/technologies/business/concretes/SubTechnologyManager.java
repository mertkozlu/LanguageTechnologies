package language.technologies.business.concretes;

import language.technologies.business.abstracts.SubTechnologyService;
import language.technologies.business.requests.CreateSubTechnologiesRequest;
import language.technologies.business.responses.GetAllSubTechnologyResponse;
import language.technologies.dataAccess.abstracts.SubTechnologyRepository;
import language.technologies.entities.SubTechnology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SubTechnologyManager implements SubTechnologyService {
    private SubTechnologyRepository subTechnologyRepository;

    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
        this.subTechnologyRepository = subTechnologyRepository;
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
        subTechnology.setName(createSubTechnologiesRequest.getName());
        this.subTechnologyRepository.save(subTechnology);

    }
}
