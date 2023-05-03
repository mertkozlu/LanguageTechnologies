package language.technologies.entities;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
public class SubTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
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
    private SubTechnology getById(int id) {
        return null;
    }

}
