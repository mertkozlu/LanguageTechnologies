package language.technologies.dto.responses;

import language.technologies.entities.SubTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdSubTechnologyResponse {
    private int id;
    private String name;

    public GetByIdSubTechnologyResponse(SubTechnology subTechnology) {
        this.id = subTechnology.getId();
        this.name = subTechnology.getName();
    }
}
