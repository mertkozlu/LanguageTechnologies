package language.technologies.entities;

import language.technologies.dto.requests.CreateSubTechnologiesRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @OneToMany(mappedBy = "programmingLanguage")
    List<SubTechnology> subTechnology;



}
