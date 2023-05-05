package language.technologies.wepApi.Controllers;

import language.technologies.business.abstracts.SubTechnologyService;
import language.technologies.dto.requests.CreateSubTechnologiesRequest;
import language.technologies.dto.requests.DeleteSubTechnologiesRequest;
import language.technologies.dto.responses.GetAllSubTechnologyResponse;
import language.technologies.entities.SubTechnology;
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
    public void deleteById(@RequestBody DeleteSubTechnologiesRequest deleteSubTechnologiesRequest) {
        this.subTechnologyService.deleteById(deleteSubTechnologiesRequest);
    }

    @GetMapping("/getBy{id}")
    public SubTechnology getById(@PathVariable int id) {
        return subTechnologyService.getSubTechnologyById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody CreateSubTechnologiesRequest createSubTechnologiesRequest, int id) {
        this.subTechnologyService.update(createSubTechnologiesRequest, id);
    }


}
