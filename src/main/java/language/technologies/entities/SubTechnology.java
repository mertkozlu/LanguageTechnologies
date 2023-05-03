package language.technologies.entities;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
public class SubTechnology {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "programmingLanguage_id")
    private ProgrammingLanguage programmingLanguage;

    public SubTechnology() {
    }

    public SubTechnology(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
