package language.technologies.entities;

import language.technologies.dto.requests.CreateSubTechnologiesRequest;

import javax.persistence.*;
import java.util.List;

@Entity
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

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
