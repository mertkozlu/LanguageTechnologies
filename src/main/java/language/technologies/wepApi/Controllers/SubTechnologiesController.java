package language.technologies.wepApi.Controllers;

import language.technologies.business.abstracts.SubTechnologyService;
import language.technologies.business.requests.CreateSubTechnologiesRequest;
import language.technologies.business.responses.GetAllSubTechnologyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subtechno")
public class SubTechnologiesController {
    private SubTechnologyService subTechnologyService;

    public SubTechnologiesController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }

    @GetMapping("getall")
    public List<GetAllSubTechnologyResponse> getAll() {
        return subTechnologyService.getALl();
    }

    @PostMapping("/add")
    public void add(CreateSubTechnologiesRequest createSubTechnologiesRequest) {
        this.subTechnologyService.add(createSubTechnologiesRequest);
    }


}
