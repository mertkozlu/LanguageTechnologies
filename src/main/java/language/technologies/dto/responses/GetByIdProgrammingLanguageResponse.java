package language.technologies.dto.responses;

import language.technologies.entities.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdProgrammingLanguageResponse {
    private int id;
    private String name;

    public GetByIdProgrammingLanguageResponse(ProgrammingLanguage programmingLanguage) {
        this.id = programmingLanguage.getId();
        this.name = programmingLanguage.getName();
    }
}
