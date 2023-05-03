package language.technologies.wepApi.Controllers;

import language.technologies.business.abstracts.SubTechnologyService;
import language.technologies.dto.requests.CreateSubTechnologiesRequest;
import language.technologies.dto.responses.GetAllSubTechnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subtechno")
public class SubTechnologiesController {
    private SubTechnologyService subTechnologyService;

    public SubTechnologiesController(SubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }

    @GetMapping("getAll")
    public List<GetAllSubTechnologyResponse> getAll() {
        return subTechnologyService.getALl();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateSubTechnologiesRequest createSubTechnologiesRequest) {
        this.subTechnologyService.add(createSubTechnologiesRequest);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestBody int id) {
        this.subTechnologyService.deleteById(id);
    }


}
