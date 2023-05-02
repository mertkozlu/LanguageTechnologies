package language.technologies.wepApi.Controllers;

import language.technologies.business.abstracts.ProgrammingLanguageService;
import language.technologies.business.requests.CreateProgrammingLanguagesRequest;
import language.technologies.business.responses.GetAllProgrammingLanguageResponse;
import language.technologies.business.responses.GetAllSubTechnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }
    @GetMapping("/getall")
    public List<GetAllProgrammingLanguageResponse> getAll() {
        return programmingLanguageService.getALl();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest) {
        this.programmingLanguageService.add(createProgrammingLanguagesRequest);
    }





}
