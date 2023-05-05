package language.technologies.wepApi.Controllers;

import language.technologies.business.abstracts.ProgrammingLanguageService;
import language.technologies.dto.requests.CreateProgrammingLanguagesRequest;
import language.technologies.dto.responses.GetAllProgrammingLanguageResponse;
import language.technologies.entities.ProgrammingLanguage;
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

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam int id) {
        this.programmingLanguageService.deleteById(id);
    }

    @GetMapping("/getBy{id}")
    public ProgrammingLanguage getById(@PathVariable int id) {
        return programmingLanguageService.getProgramingLanguageById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest, int id) {
        this.programmingLanguageService.update(createProgrammingLanguagesRequest, id);
    }
}
