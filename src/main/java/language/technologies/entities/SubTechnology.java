package language.technologies.entities;

import javax.persistence.*;

@Table
@Entity
public class SubTechnology {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

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
